package shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeList {
    private static Map<Integer, Shape> shapes = new HashMap<>();

    public void addShape(int id, Shape shape) {
        shapes.put(id, shape);
    }

    public void deleteShape(int id) {
        shapes.remove(id);
    }

    public Shape getShapeById(int id) {
        return shapes.get(id);
    }

    public void moveShape(int id, int x, int y) {
        Shape shape = shapes.get(id);
        shape.getCenter().setX(x);
        shape.getCenter().setY(y);
    }

    public void displayAll() {
        for (Shape s : shapes.values()) {
            System.out.println(s);
        }
    }

    public Map<Integer, Shape> getShapes() {
        return shapes;
    }

    
}
