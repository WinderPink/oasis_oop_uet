/**
 * Lớp Student kế thừa từ lớp Person với thuộc tính: chương trình học, năm học và học phí.
 * Cung cấp các phương thức để truy xuất và thay đổi các thuộc tính của sinh viên.
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor để khởi tạo các thông tin của sinh viên.
     *
     * @param name    Tên của sinh viên
     * @param address Địa chỉ của sinh viên
     * @param program Chương trình học của sinh viên
     * @param year    Năm học của sinh viên
     * @param fee     Học phí của sinh viên
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Lấy chương trình học của sinh viên.
     *
     * @return Chương trình học của sinh viên
     */
    public String getProgram() {
        return program;
    }

    /**
     * Cập nhật chương trình học của sinh viên.
     *
     * @param program Chương trình học mới của sinh viên
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Lấy năm học của sinh viên.
     *
     * @return Năm học của sinh viên
     */
    public int getYear() {
        return year;
    }

    /**
     * Cập nhật năm học của sinh viên.
     *
     * @param year Năm học mới của sinh viên
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Lấy học phí của sinh viên.
     *
     * @return Học phí của sinh viên
     */
    public double getFee() {
        return fee;
    }

    /**
     * Cập nhật học phí của sinh viên.
     *
     * @param fee Học phí mới của sinh viên
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Chuyển đối tượng Student thành chuỗi mô tả thông tin của sinh viên.
     *
     * @return Chuỗi mô tả thông tin của sinh viên
     */
    @Override
    public String toString() {
        return String.format("Student[%s,program=%s,year=%d,fee=%.1f]",
                super.toString(),
                this.program,
                this.year,
                this.fee);
    }
}
