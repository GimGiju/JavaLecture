package ch05_reference;

import java.util.Arrays;

public class Ex99_Q1Number {

	public static void main(String[] args) {
		//1. 1에서 1000사이에 0은 몇번, 1은 몇번, ...., 9는 몇번 사용되었는가?
		// 0123456789101112131415....9991000
		String numStr = "";
		for (int i = 1; i <= 1000; i++){
		    numStr += i;
		}
		//정규표현식 사용
		//[^3] : 3이 아닌 글자
		for (int i = 0; i<= 9; i++) {
			String numbers = numStr.replaceAll("[^" + i + "]", "");
			int count = numbers.length();
			System.out.println(i + ": " + count);
		}
		
		// 배열을 사용해서 숫자를 일일이 카운트
		int countArray[] = new int[10];  // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		for(int i = 0; i < numStr.length(); i++) {
			char num = numStr.charAt(i);  // '0','1', '2', ...., '9' 중에 하나의 값 
			int numValue = num - '0';	// 0, 1, 2, ...., 9 숫자 값
			countArray[numValue]++;
		}
		System.out.println(Arrays.toString(countArray));
	}
}