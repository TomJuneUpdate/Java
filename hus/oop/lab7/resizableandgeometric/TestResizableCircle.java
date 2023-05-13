package hus.oop.lab7.resizableandgeometric;

public class TestResizableCircle {
    public static void main(String[] args) {
        // variable Resizable
        Resizable resizableCircle1 = new ResizableCircle(1);
        resizableCircle1.resize(5);
        System.out.println(resizableCircle1);
        //GeometricObject
        GeometricObject resizableCircle2 = new ResizableCircle(2);
        resizableCircle2.getPerimeter();
        resizableCircle2.getArea();
        System.out.println(resizableCircle2);
        //Circle
        Circle resizableCircle3 = new ResizableCircle(3);
        resizableCircle3.getArea();
        resizableCircle3.getPerimeter();
        //ResizableCircle
        ResizableCircle resizableCircle4 = new ResizableCircle(4);
        System.out.println(resizableCircle4);
        resizableCircle4.getArea();
        resizableCircle4.getPerimeter();
        resizableCircle4.resize(6);
    }
}
