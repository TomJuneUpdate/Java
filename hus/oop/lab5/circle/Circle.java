package hus.oop.lab5.circle;

public class Circle {
    private double radius = 1.0;
    private String coler = "red";
    private double centerX;
    private double centerY;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String coler) {
        this.radius = radius;
        this.coler = coler;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", coler='" + coler + '\'' +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
