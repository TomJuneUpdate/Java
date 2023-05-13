package hus.oop.lab6.cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder(2, "black", 3);
        System.out.println(cylinder);
        CircleManagement shapes = new CircleManagement();
        shapes.addCircle(cylinder);
        System.out.println(shapes);
    }
}
