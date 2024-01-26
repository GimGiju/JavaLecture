package account;

import java.util.List;

public interface AccountService {

	void createAccount(List<Account> list);
	
	void accountList(List<Account> list);
	
	void deposit(List<Account> list);
	
	void withdraw(List<Account> list);
	
	int findAccount(String ano, List<Account> list);
}
