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
		//list.getAno();
		for(int i = 0 ; i < list.size();i++) {
			System.out.println(list.get(i).getAno());
		}
	}

	@Override
	public void deposit() { // 예금
		System.out.println("-----------");
		System.out.println("계좌 예금");
		System.out.println("-----------");
	}

	@Override
	public void withdraw() { // 출금
		System.out.println("-----------");
		System.out.println("계좌 출금");
		System.out.println("-----------");
	}

	@Override
	public Account findAccount(String ano) {

		return null;
	}

}
