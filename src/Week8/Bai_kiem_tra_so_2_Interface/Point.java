import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor mặc định.
     * Khởi tạo điểm tại gốc tọa độ (0, 0).
     */
    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    /**
     * Constructor khởi tạo điểm với tọa độ xác định.
     *
     * @param x hoành độ (tọa độ X)
     * @param y tung độ (tọa độ Y)
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    /**
     * Constructor sao chép.
     * Tạo điểm mới có cùng tọa độ với điểm khác.
     *
     * @param point điểm cần sao chép
     */
    public Point(Point point) {
        this.pointX = point.getPointX();
        this.pointY = point.getPointY();
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * Tính khoảng cách giữa điểm hiện tại và một điểm khác.
     *
     * @param other điểm cần tính khoảng cách đến
     * @return khoảng cách giữa hai điểm
     */
    public double distance(Point other) {
        try {
            return sqrt(
                    pow(this.pointX - other.getPointX(), 2)
                    + pow(this.pointY - other.getPointY(), 2)
            );
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    /**
     * Trả về chuỗi mô tả điểm theo định dạng (x, y).
     *
     * @return chuỗi biểu diễn tọa độ điểm
     */
    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)",
                this.pointX,
                this.pointY
        );
    }

    /**
     * So sánh hai điểm xem có bằng nhau hay không.
     * Hai điểm được xem là bằng nhau nếu chênh lệch giữa
     * tọa độ X và Y của chúng nhỏ hơn hoặc bằng 0.001.
     *
     * @param o đối tượng cần so sánh
     * @return true nếu hai điểm bằng nhau, ngược lại false
     */
    @Override
    public boolean equals(Object o) {
        try {
            if (o instanceof Point) {
                Point another = (Point) o;
                return Math.abs(this.pointX - another.getPointX())
                        <= 0.001
                        && Math.abs(this.pointY - another.getPointY())
                        <= 0.001;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
