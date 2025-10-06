/**
 * Lớp Staff kế thừa từ lớp Person với các thuộc tính như trường học và mức lương.
 * Cung cấp các phương thức để truy xuất và thay đổi các thuộc tính của nhân viên.
 */
public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor để khởi tạo thông tin của nhân viên.
     *
     * @param name    Tên của nhân viên
     * @param address Địa chỉ của nhân viên
     * @param school  Trường học của nhân viên
     * @param pay     Mức lương của nhân viên
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Lấy trường học của nhân viên.
     *
     * @return Trường học của nhân viên
     */
    public String getSchool() {
        return school;
    }

    /**
     * Cập nhật trường học của nhân viên.
     *
     * @param school Trường học mới của nhân viên
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Lấy mức lương của nhân viên.
     *
     * @return Mức lương của nhân viên
     */
    public double getPay() {
        return pay;
    }

    /**
     * Cập nhật mức lương của nhân viên.
     *
     * @param pay Mức lương mới của nhân viên
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Chuyển đối tượng Staff thành chuỗi mô tả thông tin của nhân viên.
     *
     * @return Chuỗi mô tả thông tin của nhân viên
     */
    @Override
    public String toString() {
        return String.format("Staff[%s,school=%s,pay=%.1f]",
                super.toString(),
                this.school,
                this.pay);
    }
}
