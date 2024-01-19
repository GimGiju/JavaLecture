package ch10_oop.ex01_MaxMin;

public class Account  {
	final static  int MIN_BALANCE = 0;
	final static  int MAX_BALANCE = 1000000;
	
	
	private int balance;
	int i = balance;
	
	
	public int getBalance() {
		return balance;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public void setBalance(int balance) {
		if(i > Account.MAX_BALANCE  && i < Account.MIN_BALANCE);
		this.balance = balance;
	}
	

}
