package ch12_interface.sec05_default;   // 안쓰는 메소드

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.abc();
		a.def();
		
		a = new C();
		a.abc();
		a.def();     // 공통된 메소드를 인터페이스에서 가져옴
		
		A.ghi();
	}

}
