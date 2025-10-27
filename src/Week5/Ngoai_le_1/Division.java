/**
 * Biểu thức phép chia giữa hai biểu thức con.
 */
public class Division extends BinaryExpression {

    /**
     * Khởi tạo biểu thức chia.
     * @param left toán hạng bên trái
     * @param right toán hạng bên phải
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về chuỗi biểu diễn phép chia dạng (left / right).
     * @return chuỗi biểu thức
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Tính thương giá trị hai biểu thức con.
     * Ném ngoại lệ nếu mẫu bằng 0.
     * @return giá trị biểu thức
     * @throws ArithmeticException nếu chia cho 0
     */
    @Override
    public double evaluate() throws ArithmeticException {
        double rightValue = right.evaluate();
        if (rightValue == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / rightValue;
    }
}
