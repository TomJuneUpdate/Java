package hus.oop.lab7.geometricInterface;

public class Rectangle implements GeometricObject {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle[" + "width=" + width + ", length=" + length + ']';
    }
}
