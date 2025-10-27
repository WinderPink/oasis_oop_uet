import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Rectangle constructor 1.
     */
    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

    /**
     * Rectanble constructor 2.
     * @param width rectangle width
     * @param length rectangle length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
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
                "Rectangle[width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.width,
                this.length,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}