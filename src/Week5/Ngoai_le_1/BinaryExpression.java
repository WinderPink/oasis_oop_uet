/**
 * Biểu thức nhị phân với hai toán hạng trái và phải.
 * Các lớp con sẽ định nghĩa phép toán cụ thể.
 */
public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Khởi tạo biểu thức nhị phân với hai toán hạng.
     * @param left biểu thức bên trái
     * @param right biểu thức bên phải
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Trả về chuỗi biểu diễn biểu thức dạng (left ? right).
     * @return chuỗi biểu thức
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " ? " + right.toString() + ")";
    }

    /**
     * Giá trị mặc định: chia hai biểu thức.
     * Các lớp con nên override phương thức này.
     * @return giá trị biểu thức
     */
    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
