package ch05_reference;

import java.util.Arrays;

public class Ex01_Array {

	public static void main(String[] args) {
		//배열 생성
		// 배열을 생성하면서 값을 지정하는 경우
		int[] score = {80, 90, 78, 93, 65};       // []는 자료형뒤에 와도 괜찮고 변수명 뒤에 와도 괜찮음 ex) 자료명(int)[] 변수명[score] 이나 자료명(int) 변수명(score) [] 이런식
		char grade[] = {'B', 'A', 'C', 'A', 'D'};
		// 배열을 생성하면서 크기를 지정하는 경우
		int[] newArray = new int[10]; // 10개의 데이터를 받는 것을 지정
		
		// 배열 인덱싱
		System.out.println(score[0] + ", " + score[4]);
		for(int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		System.out.println();
		
		// 값을 할당
		score[0] = 90;grade[0] = 'A';
		for (int i = 0; i < newArray.length; i++)
			newArray[i] = 1 + (int) (Math.random() * 6);
		System.out.println(Arrays.toString(newArray));    //overloading 동일한 타입이 자료형 뒤에 변수명을 동일하게 설정가능하게 해줌
		System.out.println(Arrays.toString(score));
	}

}
