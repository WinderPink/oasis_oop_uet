/**
 * Lớp Circle đại diện cho hình tròn với bán kính và màu sắc.
 * Cung cấp các phương thức tính diện tích và truy xuất / đặt giá trị của các thuộc tính
 */
public class Circle {
    // Các thuộc tính của lớp Circle
    private double radius;
    private String color;

    // Hằng số PI
    protected static final double PI = 3.1415926535;

    // Constructor mặc định, khởi tạo giá trị mặc định cho radius và color
    public Circle() {
        this.radius = 0;
        this.color = "";
    }

    /**
     * Constructor với radius, color mặc định là "".
     *
     * @param radius bán kính hình tròn
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "";
    }

    /**
     * Constructor với radius, color.
     *
     * @param radius bán kính hình tròn
     * @param color  màu của hình tròn
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Lấy bán kính của hình tròn.
     *
     * @return bán kính của hình tròn
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Lấy màu của hình tròn.
     *
     * @return màu của hình tròn
     */
    public int getColor() {
        return color;
    }

    /**
     * Cập nhật bán kính hình tròn.
     *
     * @param radius bán kính hình tròn
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Cập nhật màu của hình tròn.
     *
     * @param color màu hình tròn
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Tính diện tích của hình tròn.
     *
     * @return diện tích của hình tròn
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Chuyển đổi đối tượng Circle thành chuỗi mô tả.
     *
     * @return chuỗi mô tả thông tin của hình tròn
     */
    public String toString() {
        return String.format("Circle[radius=%.1f,color=%s]",
                this.radius,
                this.color);
    }
}