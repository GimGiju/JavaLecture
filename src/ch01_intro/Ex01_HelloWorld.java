package ch01_intro;

// class 이름은 Ex01_HelloWorld는 대문자로 시작
public class Ex01_HelloWorld {
	
	/**
	 * 도큐먼트 주석 - API document 만들때 사용
	 * @param args
	 */
	
	// method 이름 main은 소문자로 시작
	public static void main(String[] args) {
		// sysout, syso 를 타이핑 한 후 Ctrl + space 치면 System.out.println(); 가 생김
		System.out.println("Hello World!!!");		// 문장 끝에는 반드시 세미콜론(;)을 붙여야함 
		/*
		 * 여러줄의 주석
		 */
		System.out.println("안녕하세요? " + "여러분!!!"); // 프린트 라인 안에는 하나의 문자열만 올 수 있다(두개 이상일 경우에는 + 연산자를 사용해야함)
		System.out.println();		// Ctrl + / : 문장을 커멘트 처리(토글)
	}
}

