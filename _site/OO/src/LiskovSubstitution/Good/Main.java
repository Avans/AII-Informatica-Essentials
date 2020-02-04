package LiskovSubstitution.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Main {


    private static Shape getNewRectangle()
    {
        // it can be an object returned by some factory ...
        return new Rectangle(30, 30);
    }

    // Run with VM arguments -ea to enable asserts
    public static void main(String [] args)
    {
        Shape rectangle = getNewRectangle();

        System.out.println("Test area");
        assert rectangle.calculateArea() == 900 : "Expected area of 900, got " + rectangle.calculateArea(); // 30x30

        System.out.println("Increase width");
        rectangle.increaseWidth(); // increase width by one

        System.out.println("Test area");
        assert rectangle.calculateArea() == 930 : "Expected area of 930, got " + rectangle.calculateArea(); // 31x31 while 31x30 expected

        System.out.println("Joy!");
    }

}
