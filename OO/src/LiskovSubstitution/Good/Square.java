package LiskovSubstitution.Good;


/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Square implements Shape {
    private int width;


    public Square(int width) {
        this.width = width;
    }

    public void increaseWidth() {
        width++;
    }

    @Override
    public int calculateArea() {
        return this.width ^ 2;
    }
}
