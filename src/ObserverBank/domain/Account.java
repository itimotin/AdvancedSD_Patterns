package ObserverBank.domain;

import java.util.*;
import ObserverBank.domain.Subject;
import ObserverBank.IObserver;
import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
	
	private List<IObserver> observers;
	
	
	long accountnumber;
	Collection<AccountEntry> entryList = new ArrayList<AccountEntry>();
	Customer customer;
	
	
	public Account(long accountNumber) {
		this.accountnumber = accountNumber;
		this.observers = new ArrayList<>();
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
	
	
	
	private boolean changed;
	private final Object MUTEX = new Object();
	
	@Override
	public void attach(IObserver ob) {
		// TODO Auto-generated method stub
		if (ob == null) throw new NullPointerException("Null Observer");
		synchronized(MUTEX){
			if (!observers.contains(ob)) observers.add(ob);	
		}
	}

	@Override
	public void dettach(IObserver ob) {
		// TODO Auto-generated method stub
		synchronized(MUTEX) {
			observers.remove(ob);
		}
	}
	@Override
	public void notiffyObservers() {
		// TODO Auto-generated method stub
		List<IObserver> observerLocal = null;
		synchronized (MUTEX) {
			if (!changed) {
				return ;
			}
			observerLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
	}

}
