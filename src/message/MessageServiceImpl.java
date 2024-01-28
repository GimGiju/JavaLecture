package message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageServiceImpl implements MessageService {
	Scanner scan = new Scanner(System.in);

	@Override
	public Message findbyMid(List<Message> list) {

		return null;
	}

	@Override
	public void messageSaveList(List<Message> list) {
		System.out.println("====================");
		System.out.println("0. 메시지 목록 작성");
		System.out.println("====================");
		System.out.println("메시지 순서: ");
		Message msa = new Message();
		msa.setMid(scan.nextLine());
		System.out.println("내용입력: ");
		msa.setContent(scan.nextLine());
		System.out.println("글쓴이 이름: ");
		msa.setWriter(scan.nextLine());
		System.out.println(LocalDateTime.now().toString().replaceAll("T", " ").substring(0, 16));
		System.out.println("메시지 목록 생성 완료");
		list.add(msa);

	}

	@Override
	public void messasgeList(List<Message> list) {
		System.out.println("====================");
		System.out.println("1.전체목록");
		System.out.println("====================");
		for( int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getMid());
			System.out.print(list.get(i).getContent());
			System.out.print(list.get(i).getWriter());
			System.out.println(LocalDateTime.now().toString().replaceAll("T"," "  ).substring(0, 16));
		}
		
	}

	@Override
	public void messageListByWriter(List<Message> list) {
		System.out.println("====================");
		System.out.println("2.글쓴이별 목록");
		System.out.println("====================");

	}

	@Override
	public Message insertMessage() {
		System.out.println("====================");
		System.out.println("3.글쓰기");
		System.out.println("====================");
		return null;
	}

	@Override
	public void updateMessage(List<Message> list) {
		System.out.println("====================");
		System.out.println("4.글 수정");
		System.out.println("====================");
		for (int i = 0; i < list.size(); i++) {

		}
	}

	@Override
	public void deleteMessage(List<Message> list) {
		System.out.println("====================");
		System.out.println("5.글삭제");
		System.out.println("====================");

	}

}
