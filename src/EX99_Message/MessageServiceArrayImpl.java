package EX99_Message;

import java.time.LocalDate;
import java.util.Scanner;

public class MessageServiceArrayImpl implements MessageService {
	private static Message[] messageArray = new Message[10];
	Scanner sc = new Scanner(System.in);

	public MessageServiceArrayImpl() {
		LocalDate t = LocalDate.now();
		messageArray[0] = new Message(1000, "메세지 1번", "김찰일", t);
		messageArray[1] = new Message(1001, "메세지 2번", "김찰이", t);
		messageArray[2] = new Message(1002, "메세지 3번", "김찰삼", t);
		messageArray[3] = new Message(1003, "메세지 4번", "김찰사", t);
		messageArray[4] = new Message(1004, "메세지 5번", "김찰오", t);
	}

	@Override
	public Message findByMid(int mid) {
		for(Message mas: messageArray) {
			if( mas == null) {
				return null;
			}
			if(mid == (mas.getMid()) && mas.getIsDeleted() != MessageService.DELETED) {
				return mas;
			}
		}
		return null;
	}

	@Override
	public void messageList() {
		System.out.println("-------");
		System.out.println(" ");
		System.out.println("-------");
		
		for(int i = 0; i < messageArray.length; i++) {
			Message mas = messageArray[i];
			if(mas.getIsDeleted() ==  MessageService.DELETED)
				continue;
			System.out.printf("%d %s %s %s%n ", mas.getMid(), mas.getContent(), mas.getWriter(), mas.getGenTime());
		}

	}

	@Override
	public void messageListByWriter(String writer) {
	
	}

	@Override
	public void insertMessage(Message message) {
		System.out.println();
	}

	@Override
	public void updateMessage(Message message) {
		
	}

	@Override
	public void deleteMessage(int mid) {
		System.out.println("--------");
		System.out.println("삭제");
		System.out.println("-------");
		
		System.out.print("메시지: ");
		mid = sc.nextInt();
		Message message = findByMid(mid);
		message.setIsDeleted(MessageService.DELETED);
	
	}

}
