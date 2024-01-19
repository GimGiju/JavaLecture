package ch10_oop;

public class Worker extends Person {   //extends Person 하면 Person를 상속 받았다는 뜻
	int workerId;
	
	void work() {
		System.out.println(name + " 이/가 열심히 일을 합니다");
	}
}
