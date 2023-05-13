package hus.oop.lab6.cylinder;

import java.util.ArrayList;
import java.util.List;

public class CircleManagement {
    private List<Circle> shapes;

    public CircleManagement() {
        shapes = new ArrayList<Circle>();
    }

    public double findMaxHeight() {
        double maxHeight = -999;
        for (Circle shape : shapes) {
            if (shape.getClass().getName().contains("Cylinder")) {
                if (maxHeight < ((Cylinder) shape).getHeight()) ;
                maxHeight = ((Cylinder) shape).getHeight();
            }
        }
        return maxHeight;
    }

    public void addCircle(Circle circle) {
        shapes.add(circle);
    }

    @Override
    public String toString() {
        return "CircleManagement{" + "shapes=" + shapes + '}';
    }

    public List<Circle> getShapes() {
        return shapes;
    }

    public void setShapes(List<Circle> shapes) {
        this.shapes = shapes;
    }
}
