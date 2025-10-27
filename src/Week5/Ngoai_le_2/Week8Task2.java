import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Lớp Week8Task2 chứa các phương thức sinh và xử lý 5 loại ngoại lệ khác nhau:
 * NullPointerException, ArrayIndexOutOfBoundsException,
 * ArithmeticException, FileNotFoundException và IOException.
 */
public class Week8Task2 {

    /**
     * Phương thức sinh ngoại lệ NullPointerException.
     */
    public void nullPointerEx() {
        String s = null;
        s.length(); // Gọi phương thức trên biến null sẽ sinh NullPointerException
    }

    /**
     * Phương thức sinh ngoại lệ ArrayIndexOutOfBoundsException.
     */
    public void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[3];
        int x = arr[5]; // Truy cập phần tử ngoài phạm vi mảng
    }

    /**
     * Phương thức sinh ngoại lệ ArithmeticException.
     */
    public void arithmeticEx() {
        int a = 10 / 0; // Chia cho 0 sẽ sinh ArithmeticException
    }

    /**
     * Phương thức sinh ngoại lệ FileNotFoundException.
     * @throws FileNotFoundException nếu file không tồn tại
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abcxyz.txt");
        // Mở file không tồn tại sẽ gây FileNotFoundException
    }

    /**
     * Phương thức sinh ngoại lệ IOException thủ công.
     * @throws IOException ngoại lệ nhập xuất
     */
    public void ioEx() throws IOException {
        throw new IOException("Test IOException"); // Chủ động ném ngoại lệ
    }

    /**
     * Bắt và xử lý NullPointerException.
     * @return "NullPointerException" nếu có lỗi, ngược lại "Không có lỗi"
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Bắt và xử lý ArrayIndexOutOfBoundsException.
     * @return "ArrayIndexOutOfBoundsException" nếu có lỗi, ngược lại "Không có lỗi"
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Bắt và xử lý ArithmeticException.
     * @return "ArithmeticException" nếu có lỗi, ngược lại "Không có lỗi"
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * Bắt và xử lý FileNotFoundException.
     * @return "FileNotFoundException" nếu có lỗi, ngược lại "Không có lỗi"
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * Bắt và xử lý IOException.
     * @return "IOException" nếu có lỗi, ngược lại "Không có lỗi"
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
