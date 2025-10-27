/**
 * Lớp Subtraction biểu diễn phép trừ giữa hai biểu thức.
 * Kế thừa BinaryExpression để xử lý biểu thức có hai toán hạng.
 */
public class Subtraction extends BinaryExpression {

    /**
     * Khởi tạo phép trừ với biểu thức trái và phải.
     * @param left biểu thức bên trái dấu trừ
     * @param right biểu thức bên phải dấu trừ
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về chuỗi biểu diễn phép trừ.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    /**
     * Tính giá trị của phép trừ.
     * @return kết quả left - right
     */
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
