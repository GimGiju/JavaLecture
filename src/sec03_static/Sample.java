package sec03_static;

public class Sample {           // 상수값을 static으로 설정해서 하는 예시
	int instanceField;
	public static final int STATIC_FIELD = 1234;
	
	void instanceMethod() {
		System.out.println("instance method");
	}                 //  여기까지가 주로 사용  MaxPal 참고
	
	static void staticMethod() {
		System.out.println("static method");      
	}
}
