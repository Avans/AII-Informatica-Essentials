package SingleResponsibility.Bad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Book {

    private String title;
    private String contents;

    public Book(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void render() {
        System.out.println(this.title);
        System.out.println(this.contents);
    }

    public void saveToDisk() {
        Path path = Paths.get("C:/" + this.title + ".txt");
        try {
            Files.write(path, this.contents.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
