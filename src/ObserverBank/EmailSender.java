package ObserverBank;

import ObserverBank.domain.Subject;

public class EmailSender implements IObserver {
	@Override
	public void update(Object o) {
		System.out.println("Email Sender fired......");
	}

	@Override
	public void setSubject(Subject subj) {
		// TODO Auto-generated method stub
		
	}
	
	
}
