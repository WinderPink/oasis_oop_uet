/**
 * Lớp Solution yêu cầu in ra "HelloWorld" hoặc "Hello student_name"
 * tuỳ theo có tham số dòng lệnh hay không.
 */
public class Solution {

    /**
     *
     * @return chuỗi HelloWorld
     */
    public static String printHello() {
        return "HelloWorld";
    }

    /**
     * Hàm main: điểm bắt đầu của chương trình.
     * Nếu có tham số dòng lệnh thì in "Hello student_name".
     * Nếu không có tham số thì in "HelloWorld".
     *
     * @param args tham số dòng lệnh
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Hello " + args[0]);
        } else {
            System.out.print(printHello());
        }
    }
}