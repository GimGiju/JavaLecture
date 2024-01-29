package message;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MessageServiceImpl implements MessageService {
	Scanner scan = new Scanner(System.in);

	@Override
	public Message findbyMid(List<Message> list) {

		return null;
	}

//	@Override
//	public void messageSaveList(List<Message> list) {
//		System.out.println("====================");
//		System.out.println("0. 메시지 목록 작성");
//		System.out.println("====================");
//		System.out.println("메시지 순서: ");
//		Message msa = new Message();
//		msa.setMid(scan.nextLine());
//		System.out.println("내용입력: ");
//		msa.setContent(scan.nextLine());
//		System.out.println("글쓴이 이름: ");
//		msa.setWriter(scan.nextLine());
//		System.out.println(LocalDateTime.now().toString().replaceAll("T", " ").substring(0, 16));
//		System.out.println("메시지 목록 생성 완료");
//		list.add(msa);
//
//	}

	@Override
	public void messasgeList(List<Message> list) {
		System.out.println("====================");
		System.out.println("1.전체목록");
		System.out.println("====================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getMid() + "\t");
			System.out.print(list.get(i).getContent() + "\t");
			System.out.print(list.get(i).getWriter() + "\t");
			System.out.println(LocalDate.now());
		}

	}

	@Override
	public void messageListByWriter(List<Message> list) {
		System.out.println("====================");
		System.out.println("2.글쓴이별 목록");
		System.out.println("====================");
		System.out.println("작성자 이름: ");
		String writer = scan.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWriter().equals(writer)) {
				System.out.print(list.get(i).getWriter() + "\t");
				System.out.print(list.get(i).getContent() + "\t");
				System.out.println(list.get(i).getGenTime());
			}

		}

	}

	@Override
	public Message insertMessage() {
		System.out.println("====================");
		System.out.println("3.글쓰기");
		System.out.println("====================");
		System.out.println("메시지 순서: ");

		Message msa = new Message();
		msa.setMid(Integer.parseInt(scan.nextLine()));
		System.out.println("작성자 이름: ");
		msa.setWriter(scan.nextLine());
		System.out.println("메시지 내용: ");
		msa.setContent(scan.nextLine());
		msa.setGenTime(LocalDate.now());
		return msa;
	}

//	@Override
//	public void updateMessage(List<Message> list) {
//		System.out.println("====================");
//		System.out.println("4.글 수정");
//		System.out.println("====================");
//		System.out.println("메시지 순서: ");
//		int mid = scan.nextInt();
//		System.out.println("수정할 내용: ");
//		String content = scan.nextLine();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getMid() == mid) {
//				list.get(i).setContent(content);
//
//			}
//		}
//	}
	
	@Override
	public void updateMessage(List<Message> list) {     //작성자로 검색하기, 작성자가 쓴 글이 여러개일때 어떤글을 수정할지 선택 가능하게 만들기.
		System.out.println("====================");
		System.out.println("4.글 수정");
		System.out.println("====================");
		System.
	}

	@Override
	public void deleteMessage(List<Message> list) {
		System.out.println("====================");
		System.out.println("5.글삭제");
		System.out.println("====================");
		System.out.println("삭제할 메시지의 순서: ");
		int mid = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMid() == mid) {
				list.remove(i);
				break;
			}
		}
		System.out.println("삭제 되었습니다.");
	}

}
