package ObserverBank.domain;

import ObserverBank.IObserver;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	public List<IObserver> observers = new ArrayList<>();
	
	void attach(IObserver ob) {
		observers.add(ob);
	}
	
	void dettach(IObserver ob) {
		observers.remove(ob);
	}
	void notiffy() {
		System.out.println("Your Account is Updated.......");
	}
}
