import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {
    // Biểu thức chính quy để tìm package trong mã nguồn Java
    private static final Pattern PACKAGE_PATTERN = Pattern.compile(
            "^package\\s+(.*);$", 
            Pattern.MULTILINE
    );

    // Biểu thức chính quy để tìm các import trong mã nguồn Java
    private static final Pattern IMPORT_PATTERN = Pattern.compile(
            "^import\\s+(?:static\\s+)?((?:\\w+\\.)+(\\w+));$", 
            Pattern.MULTILINE
    );

    // Biểu thức chính quy để tìm khai báo lớp (class, interface, enum)
    private static final Pattern CLASS_PATTERN = Pattern.compile(
            "^(?:\\s{2})*(?:(?:abstract|public|private|protected|static|final)\\s+)*"
            + "(class|interface|enum)\\s+([^<\\s]+)([^{]+)?\\s*\\{", 
            Pattern.MULTILINE
    );

    // Biểu thức chính quy để tìm các phương thức static trong mã nguồn Java
    private static final Pattern STATIC_METHOD_PATTERN = Pattern.compile(
            "^(?<!\\s{0,20}/\\*\\n)" 
            + "(?:\\s{2})+(?:(?:public|private|protected)\\s+)*"
            + "static\\s+(?:final\\s+)?[\\w<>,.?\\[\\]\\s]+\\s+(\\w+)"
            + "\\s*\\(([\\w<>,.?\\[\\]\\s]*)\\)\\s*\\{", 
            Pattern.MULTILINE
    );

    // Bản đồ chứa các kiểu dữ liệu đã được ánh xạ từ tên đơn giản đến tên đầy đủ
    private static final Map<String, String> dataTypeMap = new HashMap<>();

    /**
     * Chuyển đổi tên kiểu dữ liệu ngắn thành tên đầy đủ.
     * @param dataType Kiểu dữ liệu cần chuyển đổi
     * @return Kiểu dữ liệu đầy đủ tương ứng
     */
    private static String toFullType(String dataType) {
        // Nếu kiểu dữ liệu đã có trong bản đồ, trả về giá trị tương ứng
        if (dataTypeMap.containsKey(dataType)) {
            return dataTypeMap.get(dataType);
        } else if (dataType.matches("[A-Z]\\w+")) {
            // Nếu kiểu dữ liệu là tên lớp đầu tiên viết hoa, thêm "java.lang."
            return "java.lang." + dataType;
        } else if (dataType.contains("<")) {
            // Nếu kiểu dữ liệu là kiểu generic, tách phần tên lớp và kiểu dữ liệu bên trong
            String[] parts = dataType.split("<");
            parts[0] = toFullType(parts[0]);
            parts[1] = toFullType(parts[1].replace(">", ""));

            return String.format(
                    "%s<%s>", 
                    parts[0], 
                    parts[1]
            );
        } else {
            return dataType;
        }
    }

    /**
     * Lấy tất cả các phương thức static từ một chương trình Java.
     * @param fileContent Nội dung của chương trình Java
     * @return Danh sách các chữ ký phương thức static trong chương trình
     */
    public static List<String> getAllFunctions(String fileContent) {
        List<String> allMethods = new ArrayList<>();

        // Lấy tên package từ nội dung chương trình
        String packageName = "";
        Matcher matcher = PACKAGE_PATTERN.matcher(fileContent);
        if (matcher.find()) {
            packageName = matcher.group(1);
        }

        // Thêm các import vào bản đồ dataTypeMap
        matcher = IMPORT_PATTERN.matcher(fileContent);
        while (matcher.find()) {
            String fullImport = matcher.group(1);
            String nameImport = matcher.group(2);
            dataTypeMap.put(nameImport, fullImport);
        }

        // Thêm tên lớp vào bản đồ dataTypeMap
        matcher = CLASS_PATTERN.matcher(fileContent);
        while (matcher.find()) {
            String className = matcher.group(2);
            dataTypeMap.put(className, packageName + "." + className);
        }

        // Tìm tất cả các phương thức static
        matcher = STATIC_METHOD_PATTERN.matcher(fileContent);
        while (matcher.find()) {
            final String methodName = matcher.group(1);

            String allParams = matcher.group(2);
            StringBuilder allTypes = new StringBuilder();
            allTypes.append("(");

            if (!allParams.isEmpty()) {
                // Xử lý tham số: loại bỏ dấu ba chấm, trim các dòng thừa
                allParams = allParams.replaceAll("\\.{3}", "");
                allParams = allParams.replace("\n", "").trim();

                // Chia các tham số thành mảng
                String[] params = allParams.split(", ");
                for (int i = 0; i < params.length; i++) {
                    params[i] = toFullType(params[i].split(" ")[0]);
                }

                // Thêm các kiểu tham số vào string kết quả
                for (String param : params) {
                    allTypes.append(param).append(",");
                }

                // Loại bỏ dấu phẩy cuối
                allTypes.deleteCharAt(allTypes.length() - 1);
            }

            allTypes.append(")");

            // Thêm tên phương thức và các tham số vào danh sách kết quả
            allMethods.add(methodName + allTypes.toString());
        }

        return allMethods; // Trả về danh sách phương thức static
    }
}
