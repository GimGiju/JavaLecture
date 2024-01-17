package ch05_reference;

import java.util.Arrays;

public class Ex02_ArrayCopy {

	public static void main(String[] args) {
		int src[] = {1, 2, 4, 8};   // src는 소스라고 부름
		int[] dst = src;
		System.out.println(Arrays.toString(dst));
		
		dst[2] = 5;
		System.out.println(Arrays.toString(dst));
		// Sided effect(부작용) 발생: 원치 않은 src 내용도 바뀜
		System.out.println(Arrays.toString(src));   //변수는 stack에 저장되고 그 안에 src와 dst 있음
		
		int[] newSrc = {3, 4, 7, 9};
		int[] newDst = new int[4];
		// Deep copy, 2차원 배열은 불가능해서 다른 방법을 사용해야 함
		System.arraycopy(newSrc, 0, newDst, 0, newSrc.length);  // 배열의 길이 가져오는 법 : .length
		System.out.println(Arrays.toString(newDst));
		
		newDst[2] = 15;
		System.out.println(Arrays.toString(newDst));
		System.out.println(Arrays.toString(newSrc));

	}

}
