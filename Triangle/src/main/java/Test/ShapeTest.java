package Test;

public class ShapeTest {
    private static ShapeTest ourInstance = new ShapeTest();

    public static ShapeTest getInstance() {
        return ourInstance;
    }

    private ShapeTest() {
    }
}
