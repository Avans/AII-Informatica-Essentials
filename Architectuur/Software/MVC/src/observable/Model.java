package observable;

public class Model extends Observable {

	private String name;
	
	public void push(String text) {
		this.name = text;
		this.notifyObservers(this.name);
	}
}
