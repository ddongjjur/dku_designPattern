package observerPatternPrac;

import java.util.ArrayList;

public class Subject {
	
	private ArrayList<ObserverPrac> observers = new ArrayList<>();

	public void attach(ObserverPrac observer) {
		this.observers.add(observer);
	}
	
	public void detach(ObserverPrac observer) {
		this.observers.remove(observer);
	}
	
	public void Mynotify() {
		for (ObserverPrac observerPrac : observers) {
			observerPrac.update();
		}
	}
	
}
