package ObserverBank;


public class SMSSender implements IObserver {
	@Override
	public void update() {
		System.out.println("SMS Sender fired......");
	}
}
