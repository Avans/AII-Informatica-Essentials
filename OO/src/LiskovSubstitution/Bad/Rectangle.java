package LiskovSubstitution.Bad;

public class Rectangle {
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
