/**
 * Lớp Cylinder kế thừa từ lớp Circle, đại diện cho hình trụ với bán kính và chiều cao.
 * Cung cấp các phương thức tính thể tích và diện tích của hình trụ.
 */
public class Cylinder extends Circle {
    private double height;

    // Constructor mặc định, khởi tạo chiều cao là 0
    public Cylinder() {
        this.height = 0;
    }

    /**
     * Constructor với chiều cao.
     *
     * @param height Chiều cao của hình trụ
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Constructor với chiều cao và bán kính.
     *
     * @param height Chiều cao của hình trụ
     * @param radius Bán kính của hình trụ
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor với chiều cao, bán kính và màu sắc.
     *
     * @param height Chiều cao của hình trụ
     * @param radius Bán kính của hình trụ
     * @param color  Màu sắc của hình trụ
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Lấy chiều cao của hình trụ.
     *
     * @return Chiều cao của hình trụ
     */
    public double getHeight() {
        return height;
    }

    /**
     * Cập nhật chiều cao của hình trụ.
     *
     * @param height Chiều cao mới của hình trụ
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Tính thể tích của hình trụ.
     *
     * @return Thể tích của hình trụ
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * Chuyển đổi đối tượng Cylinder thành chuỗi mô tả.
     *
     * @return Chuỗi mô tả thông tin của hình trụ
     */
    @Override
    public String toString() {
        return String.format("Cylinder[%s,height=%.1f]",
                super.toString(),
                this.height);
    }

    /**
     * Tính diện tích bề mặt của hình trụ.
     *
     * @return Diện tích bề mặt của hình trụ
     */
    @Override
    public double getArea() {
        return 2.0 * PI * getRadius() * (height + getRadius());
    }
}
