package binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty name;
	
	public Model() {
		this.name = new SimpleStringProperty("empty");
	}
	
	public StringProperty nameProperty() {
		return this.name;
	}

	public void push(String text) {
		this.name.set(text);
	}
}
