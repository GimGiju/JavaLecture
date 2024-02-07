package mysql.sec06_user;

import java.util.List;

public class UserText {

	public static void main(String[] args) {
		UserService userSvc = new UserServiceMySQLImpl();
		User user = null;
		
//		User user = new User("admin", "1234", "관리자", "admin@naver.com");  // 객체 생성
//		userSvc.registerUser(user);
		
//		user = new User("james", "1234", "제임스", "james@naver.com");  // 객체 생성
//		userSvc.registerUser(user);
//		user = new User("maria", "1234", "마리아", "maria@naver.com");  // 객체 생성
//		userSvc.registerUser(user);
//		user = new User("brian", "1234", "브라이언", "brian@naver.com");  // 객체 생성
//		userSvc.registerUser(user);
//		user = new User("sarah", "1234", "사라", "sarah@naver.com");  // 객체 생성
//		userSvc.registerUser(user);
		
//		user = userSvc.getUserByUid("admin");
//		System.out.println(user);
	
//		user = userSvc.getUserByUid("james");
//		System.out.println(user);
		
//		System.out.println(userSvc.login("admin", "1234"));
//		System.out.println(userSvc.login("admin", "asdf"));
//		System.out.println(userSvc.login("james", "1234"));
		
		List<User> list = userSvc.getUserList(3);    // page 나타내기
		list.forEach(x -> System.out.println(x));
		
		userSvc.close();
	}

}
