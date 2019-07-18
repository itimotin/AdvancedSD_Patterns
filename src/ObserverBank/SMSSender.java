package ObserverBank;

import ObserverBank.domain.Subject;

public class SMSSender implements IObserver {
	@Override
	public void update(Object o) {
		System.out.println("SMS Sender fired......");
	}

	@Override
	public void setSubject(Subject subj) {
		// TODO Auto-generated method stub
		
	}
}
