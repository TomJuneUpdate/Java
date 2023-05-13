package hus.oop.lab5.rectangle;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(final float length, final float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(final float length) {
        this.length = length;
    }

    public void setWidth(final float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double premiter() {
        return 2 * this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
