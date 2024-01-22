package ch12_interface.sec11_Bank;

import java.util.Scanner;

public class BankMain {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		accountArray[0] = new Account("1000","제임스", 10000);
		accountArray[1] = new Account("1001","마리아", 300000);
		accountArray[2] = new Account("1002","브라이언", 2000000);
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine()); 
			switch(selectNo) {
			case 1:
				createAccount(accountArray); break;
			case 2:
				accountList(accountArray); break;
			case 3:
				deposit(accountArray); break;
			case 4:
				withdraw(accountArray); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Waring: 1 ~ 5 사이의 숫자만 입력하시오. ");
			}
		}	System.out.println("프로그램 종료");
	}

	public static void createAccount(Account[] accountArray) {  //생성
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.println("계좌주");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null)
				continue;
				accountArray[i] = account;
		}
	}
	
	public static void accountList(Account[] accountArray) {		// 목록
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		

		
	}
	public static void deposit(Account[] accountArray) {			// 예금
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
	
	}
	
	public static void withdraw(Account[] accountArray) {		// 출금
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
	}
	public Account findAccount(String ano, Account[] accountArray) {

		
		return null;
		
	}
}
