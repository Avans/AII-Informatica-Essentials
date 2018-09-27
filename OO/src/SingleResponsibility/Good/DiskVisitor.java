package SingleResponsibility.Good;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class DiskVisitor implements BookVisitor {

    @Override
    public void visitBook(String title, String contents) {
        Path path = Paths.get("C:/" + title + ".txt");
        try {
            Files.write(path, contents.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
