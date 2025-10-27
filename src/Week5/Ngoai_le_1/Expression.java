/**
 * Biểu thức toán học tổng quát.
 * Các lớp con phải hiện thực phương thức chuyển thành chuỗi và tính giá trị.
 */
public abstract class Expression {

    /**
     * Trả về chuỗi biểu diễn biểu thức.
     * @return chuỗi biểu thức
     */
    @Override
    public abstract String toString();

    /**
     * Tính và trả về giá trị số của biểu thức.
     * @return giá trị biểu thức
     */
    public abstract double evaluate();
}
