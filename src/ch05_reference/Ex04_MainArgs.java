package ch05_reference;

import java.util.Arrays;

public class Ex04_MainArgs {

	public static void main(String[] args) {   // String[] args는 명령어 뒤에 파라미터를 받는 코드
		System.out.println(Arrays.toString(args));   	// 매개변수의 타입은 문자열, 배열 형태로 패싱됨
		
		String[] command = "git add .".split(" ");
		command = "git  commit	 -m \"Reference Type\"".split("\\s+");  // 공백 (white space) 여러개로 분리
		System.out.println(Arrays.toString(command));
	}

}
