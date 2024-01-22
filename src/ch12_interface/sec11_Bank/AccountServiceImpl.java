package ch12_interface.sec11_Bank;

public class AccountServiceImpl implements AccountService{

	@Override
	public void createAccount(Account[] accountArray) {
		System.out.println("Service: cerateAccount()");
	}

	@Override
	public void accountList(Account[] accountArray) {
		System.out.println("Service: accountList()");
	}

	@Override
	public void deposit(Account[] accountArray) {
		System.out.println("Service: deposit()");
	}

	@Override
	public void withdraw(Account[] accountArray) {
		System.out.println("Service: withdraw()");
	}

	@Override
	public Account findAccount(String ano, Account[] accountArray) {
		System.out.println("Service: findAccount()");
		return null;
	}

	
}
