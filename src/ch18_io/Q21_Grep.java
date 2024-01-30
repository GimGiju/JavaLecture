package ch18_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q21_Grep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 문자열> ");
		String search = scan.nextLine();
		System.out.print("찾을 파일> ");
		String filename = scan.nextLine();
		scan.close();
		
		grep(search, filename);
	}
	
	static void grep(String search, String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename)); 
			int lineNO = 1;							//indexOf 내가 찾는 값이 0보다 크거나 작다로 찾을때 contains도 비슷한 기능
			while(true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}		
				String newLine = line.toLowerCase();   // 대소문자 구분하지 않겠다라는 뜻.
				if((newLine.contains(search.toLowerCase()))){
					System.out.printf("%4d:\t%s%n", lineNO, line);
				}lineNO++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
