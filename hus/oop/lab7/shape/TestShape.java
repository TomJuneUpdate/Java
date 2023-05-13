package hus.oop.lab7.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        //Shape shape2 = new Shape();
        // không thể tạo 1 đối tượng từ lớp trừu tượng
    }
}
