package ch05_reference;

public class Ex99_StringQ3 {

	public static void main(String[] args) {
		// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
		// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
		
		
		int maxPal = 0, max1 = 0, max2 = 0;
		for (int i = 100; i <= 999; i++){
		    for(int k = 100; k <= 999; k++){
		        int mul = i * k;
		        if(isPalindrome(String (i * k))){
		            maxPal = mul; max1 = i; max2 = k;
		        }
		    }
		}
		System.out.println(max1*max2);
	}

	private static boolean isPalindrome(Object string) {
		// TODO Auto-generated method stub
		return false;
	}

	private static Object String(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
