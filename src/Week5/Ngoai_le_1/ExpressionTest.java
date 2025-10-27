/**
 * Lớp ExpressionTest dùng để kiểm thử các biểu thức toán học
 * được xây dựng bằng hệ thống các lớp Expression.
 */
public class ExpressionTest {

    /**
     * Hàm main tạo và đánh giá một biểu thức phức hợp,
     * sau đó in biểu thức và kết quả ra màn hình.
     */
    public static void main(String[] args) {
        Expression tenSquared = new Square(new Numeral(10));
        Expression mul = new Multiplication(new Numeral(4), new Numeral(3));

        Expression sub = new Subtraction(tenSquared, new Numeral(3));
        Expression add = new Addition(sub, mul);

        Expression total = new Square(add);

        System.out.println("Expression: " + total.toString());
        System.out.println("Result: " + total.evaluate());
    }
}
