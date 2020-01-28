package observable;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class View extends BorderPane {
	
	private ObservingText textfield;
	private ObservingText textfield2;
	private ObservingText textfield3;
	
	public View(Controller controller) {
		this.setPrefWidth(1200);
		this.setPrefHeight(200);
		
		textfield = new ObservingText();
		this.setLeft(textfield);
		controller.bindText(textfield);

		textfield2 = new ObservingText();
		this.setCenter(textfield2);
		controller.bindText(textfield2);

		textfield3 = new ObservingText();
		this.setRight(textfield3);
		controller.bindText(textfield3);
		
		Button button = new Button("Push me!");
		button.setOnMouseClicked(e -> controller.push());
		this.setBottom(button);
	}

	
}
