import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Rectangle constructor 1.
     */
    public Rectangle() {
        this.width = 0;
        this.length = 0;
        this.topLeft = new Point();
    }

    /**
     * Rectanble constructor 2.
     * @param width rectangle width
     * @param length rectangle length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.topLeft = new Point();
    }

    /**
     * Rectangle constructor 3.
     * @param width rectangle width
     * @param length rectangle length
     * @param color   Shape color
     * @param filled  filled or not
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = new Point();
    }

    /**
     * Rectangle constructor 3.
     * @param topLeft rectangle top left
     * @param width rectangle width
     * @param length rectangle length
     * @param color   Shape color
     * @param filled  filled or not
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Caculate rectangle area.
     * @return rectangle area
     */
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * Caculate rectangle perimeter.
     * @return rectangle perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    /**
     * Rectangle toString override.
     * @return rectangle string
     */
    @Override
    public String toString() {
        return String.format(
                "Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.width,
                this.length,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

    /**
     * Boolean if 2 rectangles are equal, not counting color and fiiled.
     * @param o another object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle another = (Rectangle) o;
            return Math.abs(this.width - another.getWidth())
                    <= 0.001
                    && Math.abs(this.length - another.getLength())
                    <= 0.001
                    && this.topLeft.equals(another.getTopLeft());
        }
        return false;
    }

    /**
     * Rectangle hashcode, not taking into account color and filled.
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}