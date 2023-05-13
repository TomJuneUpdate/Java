package hus.oop.lab6.cylinderusingcomposition;

import hus.oop.lab6.cylinder.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radios, String coler, double height) {
        this.base = new Circle(radios, coler);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.PI * base.getArea() + this.height * base.getCircum();
    }

    @Override
    public String toString() {
        return "Cylinder[" + base + ", height=" + height + ']';
    }
}
