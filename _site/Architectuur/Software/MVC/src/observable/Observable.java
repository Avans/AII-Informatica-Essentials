package observable;

import java.util.ArrayList;

public class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	
	public void observe(Observer observer) {
		this.observers.add(observer);
	}
	
	protected void notifyObservers(Object data) {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).notify(data);
		}
	}
	
}
