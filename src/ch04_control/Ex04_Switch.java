package ch04_control;

public class Ex04_Switch {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.equals("hello"));  //  .equals 조건을 가져올때 사용
		
		switch(s) {			//switch/case 에서는 문자열을 사용 가능하다
		case "Hello":
			System.out.println(true); break;
		case "hello":
			System.out.println("대소문자 구분"); break;
		default:
			System.out.println(false);
		}

	}

}
