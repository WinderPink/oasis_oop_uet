/**
 * Biểu thức bình phương của một biểu thức khác.
 */
public class Square extends Expression {

    private Expression expression;

    /**
     * Khởi tạo biểu thức bình phương.
     * @param expression biểu thức cần bình phương
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Trả về chuỗi biểu diễn dạng (expression) ^ 2.
     * @return chuỗi biểu thức
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * Tính giá trị bình phương của biểu thức con.
     * @return giá trị biểu thức
     */
    @Override
    public double evaluate() {
        double value = expression.evaluate();
        return value * value;
    }
}
