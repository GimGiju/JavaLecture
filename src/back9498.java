
public class back9498 {

	public static void main(String[] args) {
		char grade = ' ';
		for (int i = 100; i <= 100 && i >= 0; i++ ) {
			if (i >= 90 && i <= 100) {
				grade = 'A'; break;
			}
			else if (i >= 80 && i <= 89 ) {
				grade = 'B'; break;
			}
			else if (i >= 70 && i <= 79 ) {
				grade = 'C'; break;
			}
			else if (i >= 60 && i <= 69 ) {
				grade = 'D'; break;
			}
			else  {
				grade = 'F'; break;
			}
		}
		System.out.print(grade);

	}


}
