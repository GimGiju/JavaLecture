package ch09_modifier.sec02_access.XYZ;

import ch09_modifier.sec02_access.ABC.A;

public class C {
	void xyz() {
		A a = new A();
		System.out.println(a.a); 	// 다른 패키지의 A 클래스의 a 변수만 사용가능
	}
}
