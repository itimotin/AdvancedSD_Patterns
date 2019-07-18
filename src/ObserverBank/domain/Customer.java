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
	public void update() {
		// TODO Auto-generated method stub
		
	}
	

}
