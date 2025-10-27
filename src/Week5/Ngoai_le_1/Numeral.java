/**
 * Biểu thức biểu diễn một giá trị số thực.
 */
class Numeral extends Expression {

    private double value;

    /**
     * Khởi tạo giá trị mặc định bằng 0.
     */
    public Numeral() {
        this.value = 0;
    }

    /**
     * Khởi tạo biểu thức với giá trị cho trước.
     * @param value giá trị số
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Trả về biểu diễn chuỗi của giá trị số.
     * @return chuỗi biểu thức
     */
    @Override
    public String toString() {
        return Long.toString(Math.round(value));
    }

    /**
     * Trả về giá trị số của biểu thức.
     * @return giá trị biểu thức
     */
    @Override
    public double evaluate() {
        return value;
    }
}
