package ch12_interface.sec21_message;

public interface MessageService {
	int DELETED = 1;

	Message findByMid(int mid);
	
	void messageList();
	
	void messageListByWriter(String writer);  // 호출하는 쪽에서 writer를 읽어서 보내달라는 뜻
	
	void insertMessage(Message message);
	
	void updateMessage(Message message);
	
	void deleteMessage(int mid);
	
}
