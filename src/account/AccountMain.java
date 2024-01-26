package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		AccountServiceImpl accountService = new AccountServiceImpl();
		List<Account> list = new ArrayList<Account>();
		
		
//		Account[] accountArray = new Account[100];
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				accountService.createAccount(list);
			} else if (selectNo == 2) {
				accountService.accountList(list);
			} else if (selectNo == 3) {
				accountService.deposit(list);
			} else if (selectNo == 4) {
				accountService.withdraw(list);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
	