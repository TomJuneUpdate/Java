package hus.oop.lab7.movableinterface;

public class TestMoveblePoint {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(1, 4, 5, 6);
        System.out.println(movablePoint);
        Movable movableCircle = new MovableCircle(1, 2, 3, 6, 2);
        System.out.println(movableCircle);
    }
}
