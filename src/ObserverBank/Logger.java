package ObserverBank;

import ObserverBank.domain.Subject;

public class Logger implements IObserver {
	private String text;
	@Override
	public void update(Object text) {
		// TODO Auto-generated method stub
		System.out.println("show Log ......");
//		this.setText("Log .....");
	}
	@Override
	public void setSubject(Subject subj) {
		// TODO Auto-generated method stub
		
	}

}
