package message;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageMain {

	public static void main(String[] args) {
		MessageService messageService = new MessageServiceImpl();
		List<Message> list = new ArrayList<Message>();
		Scanner scan = new Scanner(System.in);
		
		boolean see = true;
		while(see) {
			System.out.println("====================");
			System.out.println("1.전체목록 2.글쓴이별 목록 3.글쓰기 4.글 수정 5.글삭제 6. 종료");
			System.out.println("====================");
			System.out.println("목록번호 입력: ");
			int select = scan.nextInt();
			
			
			
			
//			if( select ==0) {
//				messageService.messageSaveList(list);
//			}
			if(select == 1){
				messageService. messasgeList(list);
			}else if(select == 2){
				messageService.messageListByWriter(list);
			}else if(select == 3){
				Message me = messageService.insertMessage();
				list.add(me);
			}else if(select == 4){
				messageService.updateMessage(list);
			}else if(select == 5){
				messageService.deleteMessage(list);
			}else if (select == 6) {
				see = false;
			}
			System.out.println("종료");
		}
			
			

	}

}
