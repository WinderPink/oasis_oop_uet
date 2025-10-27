import java.util.Objects;

public class Circle extends Shape {
    protected double radius;

    /**
     * Circle constructor 1.
     */
    public Circle() {
        this.radius = 0;
    }

    /**
     * Circle constructor 2.
     * @param radius Circle radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle constructor 3.
     * @param radius  circle radius
     * @param color   Shape color
     * @param filled  filled or not
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Caculate circle area.
     * @return circle area
     */
    @Override
    public double getArea() {
        final double PI = 3.1415926535;
        return this.radius * this.radius * PI;
    }

    /**
     * Caculate circle perimeter.
     * @return circle perimeter
     */
    @Override
    public double getPerimeter() {
        final double PI = 3.1415926535;
        return 2 * PI * this.radius;
    }

    /**
     * Circle toString override.
     * @return Circle string
     */
    @Override
    public String toString() {
        return String.format(
                "Circle[radius=%.1f,color=%s,filled=%s]",
                this.radius,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}