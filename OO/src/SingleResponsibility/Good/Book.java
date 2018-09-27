package SingleResponsibility.Good;

public class Book {

    private String title;
    private String contents;

    public Book(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void accept(BookVisitor visitor) {
        visitor.visitBook(this.title, this.contents);
    }
}
