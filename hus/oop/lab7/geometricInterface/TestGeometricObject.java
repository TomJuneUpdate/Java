package hus.oop.lab7.geometricInterface;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        System.out.println(circle);
        System.out.println("This is circle's area " + circle.getArea());
        System.out.println("This is circle's perimeter  " + circle.getPerimeter());
        GeometricObject rectangle = new Rectangle(4, 7);
        System.out.println(rectangle);
        System.out.println("This is rectangle's area " + rectangle.getArea());
        System.out.println("This is rectangle's perimeter  " + rectangle.getPerimeter());
    }
}
