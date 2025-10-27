import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point newPoint) {
        return Math.sqrt((newPoint.pointX - this.pointX) * (newPoint.pointX - this.pointX)
                + (newPoint.pointY - this.pointY) * (newPoint.pointY - this.pointY));
    }

    /**
     * Boolean if 2 point are equal.
     * @param o another object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Point another = (Point) o;
            return Math.abs(this.pointX - another.getPointX())
                    <= 0.001
                    && Math.abs(this.pointY - another.getPointY())
                    <= 0.001;
        }
        return false;
    }

    /**
     * Point hashcode.
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * Point String.
     * @return Point String
     */
    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}