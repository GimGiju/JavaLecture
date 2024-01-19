package xyz;

import abc.A;

public class D extends A {
	void xyz() {
		System.out.println(a + b);		// 다른 패키지 A 클래스의 a, b 변수 사용가능
	}
}
