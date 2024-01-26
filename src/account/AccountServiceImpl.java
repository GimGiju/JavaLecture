package account;

import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService {
	Scanner scan = new Scanner(System.in);

	@Override
	public void createAccount(List<Account> list) { // 생성
		System.out.println("-----------");
		System.out.println("계좌 생성");
		System.out.println("-----------");
		System.out.println("계좌번호: ");
		Account acc = new Account();
		acc.setAno(scan.nextLine());
		System.out.println("계좌주: ");
		acc.setOwner(scan.nextLine());
		System.out.println("최초입금액: ");
		acc.setBalance(scan.nextLine());
		System.out.println("계좌가 생성 되었습니다.");
		list.add(acc);

	}

	@Override
	public void accountList(List<Account> list) { // 목록
		System.out.println("-----------");
		System.out.println("계좌 목록");
		System.out.println("-----------");
		// list.getAno();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAno());
			System.out.println(list.get(i).getOwner());
			System.out.println(list.get(i).getBalance());

		}
	}

	@Override
	public void deposit(List<Account> list) { // 예금
		System.out.println("-----------");
		System.out.println("계좌 예금");
		System.out.println("-----------");
		System.out.println("계좌번호: ");
		String Ano = (scan.nextLine());
		int idx = findAccount(Ano, list);
//		System.out.println(idx);
		if (idx == list.size() + 1) {
			System.out.println("계좌가 없습니다.");
		}else {
			System.out.println("예금액: ");
			int money = (scan.nextInt());
			list.get(idx).setBalance(String.valueOf(Integer.parseInt(list.get(idx).getBalance()) + money));
			System.out.println("예금에 성공 하였습니다.");
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getAno().equals(Ano)) {
//				System.out.println("예금액: ");
//				int money = (scan.nextInt());
//				list.get(i).setBalance(list.get(i).getBalance() + money);
//				System.out.println("예금에 성공 하였습니다.");
//				check = 1;
//				break;
//			}
//		}
//		if (check == 0) {
//			System.out.println("계좌 x");
//		}

	}

	@Override
	public void withdraw(List<Account> list) { // 출금
		System.out.println("-----------");
		System.out.println("계좌 출금");
		System.out.println("-----------");
		System.out.println("계좌번호: ");
		String Ano = (scan.nextLine());
		int idx = findAccount(Ano,list);
		if(idx == list.size() + 1) {
			System.out.println("계좌가 없습니다.");
		}
		else {
			System.out.println("출금액: ");
			int money = Integer.parseInt(scan.nextLine());
			if (Integer.parseInt(list.get(idx).getBalance()) >=  money) {
				list.get(idx).setBalance(String.valueOf(Integer.parseInt(list.get(idx).getBalance()) - money));
			}
		}
		
						/*
				 * int money = (scan.nextInt()); if (list.get(i).getBalance() >= money) {
				 * list.get(i).setBalance(list.get(i).getBalance() - money);
				 * System.out.println("출금에 성공 하였습니다."); k = 1; break; } if (k == 0) {
				 * System.out.println("계좌가 없습니다.");
				 * 
				 * }
				 */			
		
	}

	@Override
	public int findAccount( String ano, List<Account> list) {
		int chk = list.size() + 1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAno().equals(ano)) {
				chk = i;
			}
		}
		if(chk == list.size() + 1) {
			return list.size() + 1;
		}
		else {
			return chk;
		}
	}
}
