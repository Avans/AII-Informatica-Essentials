package binding;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Controller controller = new Controller(new Model());
		View view = new View(controller);
		
		Scene scene = new Scene(new Group(view));
        stage.setTitle("Welcome to passthrough!");
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
	}

}
