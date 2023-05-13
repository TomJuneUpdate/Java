package hus.oop.lab6.pointandline;

class LineTest {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);
    }
}
