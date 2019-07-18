package ObserverBank.service;

import java.util.Collection;

import ObserverBank.dao.AccountDAO;
import ObserverBank.dao.IAccountDAO;
import ObserverBank.domain.Account;
import ObserverBank.domain.Customer;
import ObserverBank.domain.Subject;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	private Subject topic;
	
	public AccountService(){
		accountDAO=new AccountDAO();
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		System.out.println("Update");
//		String msg = (String) topic.getUpdate(this);
//		if
	}

	@Override
	public void setSubject(Subject subj) {
		// TODO Auto-generated method stub
		System.out.println("SetSubject");
		this.topic = subj;
		
	}
}
