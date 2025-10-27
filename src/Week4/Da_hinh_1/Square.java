import java.util.Objects;

public class Square extends Rectangle {

    /**
     * Square constructor 1.
     */
    public Square() {
        super();
    }

    /**
     * Square constructor 2.
     * @param side square side
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Square constructor 3.
     * @param side square side
     * @param color   Shape color
     * @param filled  filled or not
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Set square side.
     * @param side square side
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Set square side.
     * @param side square side
     */
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Square toString override.
     * @return square string
     */
    @Override
    public String toString() {
        return String.format(
                "Square[side=%.1f,color=%s,filled=%s]",
                this.width,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}