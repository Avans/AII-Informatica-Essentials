package SingleResponsibility.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class ConsoleVisitor implements BookVisitor {

    @Override
    public void visitBook(String title, String contents) {
        System.out.println(title);
        System.out.println(contents);
    }
}
