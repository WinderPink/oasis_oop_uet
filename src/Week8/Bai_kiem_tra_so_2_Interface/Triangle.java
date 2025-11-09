import static java.lang.Math.sqrt;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor mặc định.
     * Khởi tạo tam giác với ba điểm đều nằm tại gốc tọa độ (0, 0).
     */
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    /**
     * Constructor khởi tạo tam giác với ba điểm cho trước.
     * Ném ngoại lệ nếu ba điểm trùng nhau hoặc thẳng hàng.
     *
     * @param p1 điểm thứ nhất
     * @param p2 điểm thứ hai
     * @param p3 điểm thứ ba
     * @throws RuntimeException nếu ba điểm không tạo thành tam giác hợp lệ
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1 == null || p2 == null || p3 == null
                || isSamePoint(p1, p2)
                || isSamePoint(p1, p3)
                || isSamePoint(p2, p3)
                || isStraight(p1, p2, p3)
        ) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Kiểm tra hai điểm có trùng nhau hay không.
     *
     * @param p1 điểm thứ nhất
     * @param p2 điểm thứ hai
     * @return true nếu hai điểm trùng nhau, ngược lại false
     */
    private boolean isSamePoint(Point p1, Point p2) {
        return p1.equals(p2);
    }

    /**
     * Kiểm tra ba điểm có thẳng hàng hay không.
     * Dựa vào độ dốc (hệ số góc) của hai đoạn thẳng liên tiếp.
     *
     * @param p1 điểm thứ nhất
     * @param p2 điểm thứ hai
     * @param p3 điểm thứ ba
     * @return true nếu ba điểm thẳng hàng, ngược lại false
     */
    private boolean isStraight(Point p1, Point p2, Point p3) {
        return (p1.getPointY() - p2.getPointY()) / (p1.getPointX() - p2.getPointX())
                ==
                (p2.getPointY() - p3.getPointY()) / (p2.getPointX() - p3.getPointX());
    }

    public Point getP1() {
        return p1;
    }

    /**
     * Setter cho điểm P1.
     * Chỉ thay đổi nếu điểm mới khác hai điểm còn lại và không làm tam giác bị thẳng hàng.
     *
     * @param p1 điểm thứ nhất mới
     */
    public void setP1(Point p1) {
        if (p1 != null
                && !isSamePoint(p1, this.p2)
                && !isSamePoint(p1, this.p3)
                && isStraight(p1, this.p2, this.p3)
        ) {
            this.p1 = p1;
        }
    }

    public Point getP2() {
        return p2;
    }

    /**
     * Setter cho điểm P2.
     * Chỉ thay đổi nếu điểm mới khác hai điểm còn lại và không làm tam giác bị thẳng hàng.
     *
     * @param p2 điểm thứ hai mới
     */
    public void setP2(Point p2) {
        if (p2 != null
                && !isSamePoint(p2, this.p1)
                && !isSamePoint(p2, this.p3)
                && isStraight(this.p1, p2, this.p3)
        ) {
            this.p2 = p2;
        }
    }

    public Point getP3() {
        return p3;
    }

    /**
     * Setter cho điểm P3.
     * Chỉ thay đổi nếu điểm mới khác hai điểm còn lại và không làm tam giác bị thẳng hàng.
     *
     * @param p3 điểm thứ ba mới
     */
    public void setP3(Point p3) {
        if (p3 != null
                && !isSamePoint(p3, this.p1)
                && !isSamePoint(p3, this.p2)
                && isStraight(this.p1, this.p2, p3)
        ) {
            this.p3 = p3;
        }
    }

    /**
     * Tính diện tích tam giác theo công thức Heron.
     *
     * @return diện tích của tam giác
     */
    @Override
    public double getArea() {
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p1.distance(this.p3);
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Tính chu vi của tam giác.
     *
     * @return tổng độ dài ba cạnh của tam giác
     */
    @Override
    public double getPerimeter() {
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p1.distance(this.p3);
        return a + b + c;
    }

    /**
     * Trả về thông tin của tam giác dưới dạng chuỗi.
     *
     * @return chuỗi mô tả ba đỉnh của tam giác
     */
    @Override
    public String getInfo() {
        return String.format(
                "Triangle[%s,%s,%s]",
                this.p1.toString(),
                this.p2.toString(),
                this.p3.toString()
        );
    }
}
