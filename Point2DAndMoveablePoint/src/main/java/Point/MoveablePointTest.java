package Point;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint();
        MoveablePoint moveablePoint2 = new MoveablePoint(1.8f,-5);
        MoveablePoint moveablePoint3 = new MoveablePoint(-7, 15, 3, -9);

        System.out.println(moveablePoint1);
        System.out.println(moveablePoint2);
        System.out.println(moveablePoint3);

        System.out.println(moveablePoint2.move());
    }
}
