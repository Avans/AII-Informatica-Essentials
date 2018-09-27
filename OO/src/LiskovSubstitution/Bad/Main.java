package LiskovSubstitution.Bad;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Main {


    private static Rectangle getNewRectangle()
    {
        // it can be an object returned by some factory ...
        return new Square(30);
    }

    // Run with VM arguments -ea to enable asserts
    public static void main(String [] args)
    {
        Rectangle rectangle = getNewRectangle();

        System.out.println("Test area");
        assert rectangle.calculateArea() == 900 : "Expected area of 900, got " + rectangle.calculateArea(); // 30x30

        System.out.println("Increase width");
        rectangle.increaseWidth(); // increase width by one

        System.out.println("Test area");
        assert rectangle.calculateArea() == 930 : "Expected area of 930, got " + rectangle.calculateArea(); // 31x31 while 31x30 expected

    }

}
