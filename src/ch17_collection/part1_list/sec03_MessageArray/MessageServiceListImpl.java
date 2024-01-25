package ch17_collection.part1_list.sec03_MessageArray;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService {
	private static List<Message> list = new ArrayList<>();
	private int index = 0;
	
	public MessageServiceListImpl() {
		list.add(new Message(1,"한국에 오신걸 환영합니다.", "제임스", LocalDateTime.now(), 0 ));
		list.add(new Message (2, "안녕하세요?", "마리아", LocalDateTime.now(), 0));
		list.add(new Message(3, "좋은 하루 되세요.", "브라이언", LocalDateTime.now(), 0));
		list.add(new Message(4, "오늘은 나른하네요.", "엠마", LocalDateTime.now(), 0));
		list.add(new Message(5, "퇴근 할 시간입니다.", "제임스", LocalDateTime.now(),0));
	}

	@Override
	public Message findByMid(int mid) {               //
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> getMessageListAll(String writer) {
		List<Message> alist = new ArrayList<>();
		for (Message a: list) {
			if(a.getIsDeleted() != MessageService.DELETED && a.getWriter().equals(writer)) {
				alist.add(a);
			}
		} return null;
	}
		
		

	@Override
	public List<Message> getMessageListByWriter(String weiter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMessage(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMessage(int mid) {
		// TODO Auto-generated method stub

	}

}
