import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Circle constructor 1.
     */
    public Circle() {
        this.radius = 0;
        this.center = new Point();
    }

    /**
     * Circle constructor 2.
     * @param radius Circle radius
     */
    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point();
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
        this.center = new Point();
    }

    /**
     * Circle constructor 4.
     * @param center Point center
     * @param radius  circle radius
     * @param color   Shape color
     * @param filled  filled or not
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
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
                "Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                this.center.toString(),
                this.radius,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

    /**
     * Boolean if 2 circles are equal, not counting color and filled.
     * @param o another object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle another = (Circle) o;
            return Math.abs(this.radius - another.getRadius())
                    <= 0.001
                    && this.center.equals(another.getCenter());
        }
        return false;
    }

    /**
     * Circle hashcode, not talking into account color and filled.
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}