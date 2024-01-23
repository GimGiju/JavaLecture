package ch14_exception;

public class Ex08_Throws {

	public static void main(String[] args) throws Exception {  //throws Exception 으로 예외처리를 자바프로그램에게 떠넘김
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("클래스를 찾지 못하였습니다.");
//		}
		findClass();
		}
	
	static void findClass() throws ClassNotFoundException {   // throws ClassNotFoundException 예외 처리를 해주는 과정
		Class clazz = Class.forName("java.lang.String2");   // 여기서 예외 처리할것을 위에 try쪽으로 떠넘김
	}
	
}
