package mysql.sec05_message;

import java.util.List;

public class MessageTest {

	public static void main(String[] args) {
		MessageDao msgDao = new MessageDao();
//		@Autowired private Message msgDao;  나중에 위 코드가 이런식으로 사용됨

		Message msg = msgDao.getMessageByMid(102);
		System.out.println(msg);
		
//		msg = new Message("집에 빨리 가고 싶어요.", "브라이언");
//		msgDao.insertMessage(msg);
		
//		msg = msgDao.getMessageByMid(107);
//		msg.setContent("MessageDao 프로그램을 완성시키고 싶어요.");
//		msgDao.updateMessage(msg);
		
		msgDao.deleteMessage(107);
		
		List<Message> list = msgDao.getMessageListByWriter("브라이언");
		list.forEach(x -> System.out.println(x));
		
		msgDao.close();
	}

}