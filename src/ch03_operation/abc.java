package ch03_operation;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N> ");
		int N = scanner.nextInt();
		for(int k = 1; k < 10; k++) {
			int i = N * k;
		
		
			System.out.println(N + " * " + k + " = " + i);
		}
	}

}
