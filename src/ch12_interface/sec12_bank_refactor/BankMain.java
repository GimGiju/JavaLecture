package ch12_interface.sec12_bank_refactor;

import java.util.Scanner;

public class BankMain {
	private static Scanner scanner = new Scanner(System.in);
	private static AccountService accountService = new AccountServiceArrayImpl();
//	private static AccountService accountService = new AccountServiceFileImpl();
//	private static AccountService accountService = new AccountServiceMySQLImpl();
//  @Aitowired private static AccountService accountService;
	
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine()); 
			switch(selectNo) {
			case 1:
				accountService.createAccount(); break;
			case 2:
				accountService.accountList(); break;
			case 3:
				accountService.deposit(); break;
			case 4:
				accountService.withdraw(); break;
			case 5: 
				accountService.delete(); break;
			case 6:
				run = false; break;
			default:
				System.out.println("Waring: 1 ~ 5 사이의 숫자만 입력하시오. ");
			}
		}	System.out.println("프로그램 종료");
	}

}
