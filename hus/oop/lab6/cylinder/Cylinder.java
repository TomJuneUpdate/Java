package hus.oop.lab6.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.PI * super.getArea() + this.height * super.getCircum();
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + "height=" + height + ']';
    }
}
