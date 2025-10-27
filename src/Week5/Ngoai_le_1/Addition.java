/**
 * Biểu thức phép cộng giữa hai biểu thức con.
 */
public class Addition extends BinaryExpression {

    /**
     * Khởi tạo biểu thức cộng.
     * @param left toán hạng bên trái
     * @param right toán hạng bên phải
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Trả về chuỗi biểu diễn phép cộng dạng (left + right).
     * @return chuỗi biểu thức
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * Tính tổng giá trị hai biểu thức con.
     * @return giá trị biểu thức
     */
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
