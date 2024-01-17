package ch04_control;

public class Ex99_Q3 {

	public static void main(String[] args) {
		for (int i = 0; ; i++) {
			if (i == 11) {	// if(i > 10) 
				break;
			} 
			if (i % 2 == 1) { // 10 % 3 : 10을 3로 나눈 나머지 값 (1)
				continue;
			}
			System.out.println(i);  // 0, 2, 4, 6, 8, 10
		}
		
		/*for (int i = 0; i <= 10; i +=2)
		 *     System.out.println(i);
		 */
	}
	
}
