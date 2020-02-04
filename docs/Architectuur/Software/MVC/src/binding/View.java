package binding;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class View extends BorderPane {

	private Text textfield;
	
	public View(Controller controller) {
		this.setPrefWidth(400);
		this.setPrefHeight(200);
		
		textfield = new Text("unknown");
		this.setCenter(textfield);
		
		controller.bindText(textfield);
		
		Button button = new Button("Push me!");
		button.setOnMouseClicked(e -> controller.push());
		this.setBottom(button);
	}
	
}
