package ch04_control;

public class Ex14_PerfectNumber {

	public static void main(String[] args) {		// void 는 return value가 없음
		for(int i = 2; i < 10000; i++){
//		    int divSum = 0;
//		    for( int k = 1; k < i; k++){            
//		        if (i % k == 0)                    
//		            divSum += k;
//		    }
//		    if (i == divSum)                        
//		      System.out.println(i);
	
		int divSum = sumOfDivisors(i);
	    if (i == divSum)        // 자기 자신을 제외한 약수의 합과 자기자신이 같으면
	        System.out.println(i);
		}
}

		static int sumOfDivisors(int num) {         //int 는 return 값이 있음
		int divSum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				divSum += i;
		}
		return divSum;
		
	}
}
