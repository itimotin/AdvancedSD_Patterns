package ObserverBank;

public class EmailSender implements IObserver {
	@Override
	public void update() {
		System.out.println("Email Sender fired......");
	}
}
