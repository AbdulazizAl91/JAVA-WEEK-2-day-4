
public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(90,70,40,20);
        movablePoint1.moveUp();
        movablePoint1.moveDown();
        movablePoint1.moveLeft();
        movablePoint1.moveRight();
        System.out.println("------------------");

        MovablePoint movablePoint2 = new MovablePoint(50,40,20,10);
        movablePoint2.moveUp();
        movablePoint2.moveDown();
        movablePoint2.moveLeft();
        movablePoint2.moveRight();
    }
}