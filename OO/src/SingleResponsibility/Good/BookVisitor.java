package SingleResponsibility.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public interface BookVisitor {

    void visitBook(String title, String contents);

}
