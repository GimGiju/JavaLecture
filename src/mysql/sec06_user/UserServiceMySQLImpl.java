package mysql.sec06_user;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceMySQLImpl implements UserService {
	private UserDao userDao = new UserDao();

	@Override
	public User getUserByUid(String uid) {
		User user = userDao.getUserByUid(uid);
		return user;
	}

	@Override
	public List<User> getUserList(int page) {  
		int offset = (page - 1) * COUNT_PER_PAGE;					//
		List<User> list = userDao.getUserList(COUNT_PER_PAGE, offset);
		return list;
	}

	@Override
	public void registerUser(User user) {			// user는 아직 암호화된 패스워드가 없가고 가정
		User u =userDao.getUserByUid(user.getUid());  // uid 중복을 방지,확인 하는 코드, uid 있으면 다시 리스트로 돌려보냄
		if(u != null) {					
			return;
		}
		String hashedPwd = BCrypt.hashpw(user.getPwd(), BCrypt.gensalt()); 
		user.setPwd(hashedPwd);
		userDao.insertUser(user);
	}

	@Override
	public void uppdateUser(User user) {
		
	}

	@Override
	public void deleteUser(String uid) {
		
	}

	@Override
	public int login(String uid, String pwd) {
		User user = userDao.getUserByUid(uid);
		if (user == null) {							// 유저 값이 널이면  USER_NOT_EXIST  사용자가 없는경우
			return USER_NOT_EXIST;
		}
		if(BCrypt.checkpw(pwd, user.getPwd())) {     // 유저값이 맞으면 로그인
			return CORRECT_LOGIN;
		}
		return WRONG_PASSWORD;						// 다 아니면 로그인 실패
		
	}

	@Override
	public void close() {
		
	}

}
