public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Constructors 1.
     */

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    /**
     * Constructors 2.
     * 
     * @param center Point - Tâm của hình tròn.
     * @param radius double - Bán kính của hình tròn.
     */

    public Circle(Point center, double radius) {
        if (center != null) {
            this.center = center;
        } else {
            this.center = new Point();
        }
        if (radius >= 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    public Point getCenter() {
        return center;
    }

    /**
     * Set center.
     * 
     * @param center Point - Tâm của hình tròn.
     */

    public void setCenter(Point center) {
        if (center != null) {
            this.center = center;
        }
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Set radius.
     * 
     * @param radius double - Bán kính của hình tròn.
     */

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    /**
     * Override methods from GeometricObject interface.
     */

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Override methods from GeometricObject interface.
     */

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Override methods from GeometricObject interface.
     */

    @Override
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]",
                this.center.toString(),
                this.radius
        );
    }
    
}
