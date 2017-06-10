package training.bdd;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Shape> shapes = new ArrayList<Shape>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public int count() {
        return shapes.size();
    }

    public int calculateAreaOfObjects() {
        int result = 0;
        for (Shape shape : shapes) {
            result += shape.getArea();
        }
        return result;
    }
}
