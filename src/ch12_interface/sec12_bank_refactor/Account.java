package ch12_interface.sec12_bank_refactor;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	private int isDelete;
	
	public Account() {}

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public Account(String ano, String owner, int balance, int isDeleted) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.isDelete = isDeleted;
	}
	
	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "Account [isDeleted=" + isDelete + "]";
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	


	
	
}
