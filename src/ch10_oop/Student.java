package ch10_oop;

public class Student extends Person {
	int studentId;
	
	void study() {
		System.out.println(name + " 이/가 공부를 합니다.");
	}
}
