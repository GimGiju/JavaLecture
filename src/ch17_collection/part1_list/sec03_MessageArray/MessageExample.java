package ch17_collection.part1_list.sec03_MessageArray;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageExample {      

	public static void main(String[] args) {
		List<Message>list = new ArrayList<>();
		
		// 객체 추가
		Message message = new Message(1, "Hi", "길동", LocalDateTime.now(), 0);
		list.add(message);
		list.add(new Message(2, "Bye", "자바", LocalDateTime.now(), 0));
		for (Message m: list)
			System.out.println(m);
		
		for(int i = 1; i <= 3; i++) {     //반복문으로 리스트에 객체를 추가하는 방법
			Message msg = new Message(2+i, "내용"+ i, "저자"+ i, LocalDateTime.now(), 0);
			list.add(msg);
		}
		list = generateMessages();   // 이걸로 아래 입력하게 만들수있음
		for (Message m: list)
			System.out.println(m);
		
		// 이름이 3글자 이상인 사람의 글
		List<Message> newList = new ArrayList<Message>();
		for (Message msg: list) {
			if(msg.getWriter().length() >=3)
				newList.add(msg);
		}
		for (Message m: list)
			System.out.println(m);
	}
	
	// 메세지 객체를 3개 생성해서 리스트로 반환
	static List<Message> generateMessages() {
		List<Message>list = new ArrayList<Message>();
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.print("저자> ");
			String writer = scan.nextLine();
			System.out.print("내용> ");
			String content = scan.nextLine();
			Message msg = new Message(i, content, writer, LocalDateTime.now(), 0);
			list.add(msg);
		}
		return list;
	}
	
}
