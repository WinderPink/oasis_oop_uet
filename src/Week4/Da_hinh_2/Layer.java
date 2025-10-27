import java.util.ArrayList;
import java.util.List;


public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Get info of layer.
     * @return layer string info
     */
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Layer of crazy shapes:");
        for (Shape shape : shapes) {
            s.append("\n").append(shape.toString());
        }
        return s.toString();
    }

    /**
     * Remove duplicates from shape list.
     */
    public void removeDuplicates() {
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            boolean isDuplicate = false;
            for (Shape unique : uniqueShapes) {
                if (shape.toString().equals(unique.toString())) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueShapes.add(shape);
            }
        }
        this.shapes = uniqueShapes;
    }

}