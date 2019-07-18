package ObserverBank.domain;

import java.util.*;
import ObserverBank.domain.Subject;
import ObserverBank.IObserver;;

public class Account implements Subject {
	long accountnumber;
	Collection<AccountEntry> entryList = new ArrayList<AccountEntry>();
	Customer customer;

	private Observer observer;
	
	public Account (long accountnr){
		this.accountnumber = accountnr;
		this.observer = new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		double balance=0;
		for (AccountEntry entry : entryList) {
			balance+=entry.getAmount();
		}
		return balance;
	}
	public void deposit(double amount){
		AccountEntry entry = new AccountEntry(new Date(), amount, "deposit", "", "");
		entryList.add(entry);
		
	}
	public void withdraw(double amount){
		AccountEntry entry = new AccountEntry(new Date(), -amount, "withdraw", "", "");
		entryList.add(entry);	
	}

	private void addEntry(AccountEntry entry){
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description){
		AccountEntry fromEntry = new AccountEntry(new Date(), -amount, description, ""+toAccount.getAccountnumber(), toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(new Date(), amount, description, ""+toAccount.getAccountnumber(), toAccount.getCustomer().getName());
		entryList.add(fromEntry);	
		toAccount.addEntry(toEntry);
		toAccount.deposit(amount);
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}
	@Override
	public void attach() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dettach() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notiffy() {
		// TODO Auto-generated method stub
		
	}

}
