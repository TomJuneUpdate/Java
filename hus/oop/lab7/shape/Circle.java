package hus.oop.lab7.shape;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ']' + ",radius=" + radius;
    }
}
