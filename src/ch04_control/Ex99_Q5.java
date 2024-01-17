package ch04_control;

public class Ex99_Q5 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {			
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println("A"); // A는 4회 출력됨 이유:  i가 0일때 A가 1회 i가 1일때 A가 2회 2일때 0회(continue로 되돌아갔기때문에) 
			}								// i가 3일때 3회 i가 4일때 4회 A가 출력되고 그 후에 j의 값이 1이 되기때문에 더이상 값이 출력되지않음
		}

	}

}
