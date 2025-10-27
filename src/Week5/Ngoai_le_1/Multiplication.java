/**
 * Biểu thức phép nhân giữa hai biểu thức con.
 */
public class Multiplication extends BinaryExpression {

    /**
     * Khởi tạo biểu thức nhân.
     * @param left toán hạng bên trái
     * @param right toán hạng bên phải
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về chuỗi biểu diễn phép nhân dạng (left * right).
     * @return chuỗi biểu thức
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    /**
     * Tính tích giá trị hai biểu thức con.
     * @return giá trị biểu thức
     */
    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
