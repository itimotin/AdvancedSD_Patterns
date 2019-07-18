package ObserverBank.domain;

import ObserverBank.IObserver;

public class Customer implements IObserver {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubject(Subject subj) {
		// TODO Auto-generated method stub
		
	}
	

}
