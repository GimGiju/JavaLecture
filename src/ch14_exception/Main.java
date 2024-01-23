package ch14_exception;

import ch14_exception.sec09_class.MyException;
import ch14_exception.sec09_class.MyRunTimeException;

public class Main {

	public static void main(String[] args) throws MyException {
		MyException me1 = new MyException();
		MyException me2 = new MyException("내가 만든 예외 클래스");
		
		//예외를 발생 시키고 싶으면
//		throw me1;
//		throw me2;   //Exception in thread "main" ch14_exception.sec09_class.MyException: 내가 만든 예외 클래스
//		throw new MyException("의도적 예외 발생");
		
//		throw new MyRunTimeException("의도적 런타임 예외 발생");
		
		try {
			for(int i = 0; i <= 100000; i++) {
				for (int k = 0; k <= 1000000; k++) {
					if (i == 100 && k == 100)
						throw new MyException("의도적 예외 발생");
				}
			}
		} catch (MyException e) {
//			e.printStackTrace();    // 이것을 지우면 빨간줄 생기지 않고 밑에 이중 루프 탈출! 만 표시됨
		}
		System.out.println("이중 루프 탈출!");
		
	}

}
