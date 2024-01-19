package ch10_oop.ex02_Bank;

import java.util.Scanner;

public class Account1Main {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {  //생성
		
	}
	
	private static void accountList() {		// 목록
		
	}
	
	private static void deposit() {			// 예금
		
	}
	
	private static void withdraw() {		// 출금
		
	}
	
	
	private static Account1 findAccount(String ano) {
		return null;
		
	}
}
