package ObserverBank.domain;

import ObserverBank.IObserver;
import java.util.ArrayList;
import java.util.List;

public interface Subject {
	
	void attach(IObserver ob) ;
	
	void dettach(IObserver ob) ;
	void notiffyObservers();
}
