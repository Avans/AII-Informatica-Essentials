package LiskovSubstitution.Bad;

public class Square extends Rectangle {

    public Square(int width) {
        super(width, width);
    }

    @Override
    public void increaseWidth() {
        super.increaseWidth();
        height = width;
    }
}
