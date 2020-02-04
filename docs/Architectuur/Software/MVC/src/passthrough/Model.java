package passthrough;

public class Model {

	private String name;
	
	public Model() {
		this.name = "empty";
	}


	public String push(String text) {
		this.name = text;
		return this.name;
	}
}
