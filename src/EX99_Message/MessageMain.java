package EX99_Message;

import java.util.Scanner;

public class MessageMain {
	private static Scanner sc = new Scanner(System.in);
	private static Message messageService = new MessageServiceArrayImpl();

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.   2.   3.   4.   5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택: ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			switch(selectNo) {
			case 1:
				messageService.messageList(); break;
			case 2:
				messageService.messageListByWriter(String writer); break;
			case 3:
				messageService.insertMessage(messageService message);; break;
			case 4:
				messageService.updateMessage(messageService message); break;
			case 5:
				messageService.deleteMessage(); break;
			case 6:
				run = false; break;
			}
		}
	}
	
}
