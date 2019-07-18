package ObserverBank.service;

import java.util.Collection;
import ObserverBank.domain.Account;
import ObserverBank.IObserver;

public interface IAccountService extends IObserver {
    Account createAccount(long accountNumber, String customerName);
    Account getAccount(long accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (long accountNumber, double amount);
    void withdraw (long accountNumber, double amount);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
