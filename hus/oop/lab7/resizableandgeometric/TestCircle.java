package hus.oop.lab7.resizableandgeometric;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(2);
        Circle circle2 = new Circle(3);
        System.out.println("Area :" + circle.getArea());
        System.out.println("Perimeter :" + circle.getPerimeter());


    }
}
