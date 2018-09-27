package LiskovSubstitution.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Rectangle implements Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void increaseWidth() {
        this.width++;
    }

    public int calculateArea() {
        return this.width * this.height;
    }
}
