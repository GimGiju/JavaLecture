package message;

import java.util.ArrayList;
import java.util.List;

public interface MessageService {
	
	

	void findbyMid(List<Message>list );

	void messasgeList(List<Message> list);

	void messageListByWriter(List<Message>list);

	Message insertMessage(int index);

	void updateMessage(List<Message>list);

	void deleteMessage(List<Message> list);

}
