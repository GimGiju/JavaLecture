package account;

import java.util.List;

public interface AccountService {

	void createAccount(List<Account> list);
	
	void accountList(List<Account> list);
	
	void deposit();
	
	void withdraw();
	
	Account findAccount(String ano);
}
