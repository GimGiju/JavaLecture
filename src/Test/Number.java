package Test;

public class Number {

	public static void main(String[] args) {
		//1) 1에서 100까지 3의 배수의 합을 구하세요
		int sum = 0;
		for (int i = 1; i <= 100; i++  ) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		//2) 1에서 20까지 홀수 제곱의 합을 구하세요.[10]

		int num = 0;
		for(int i = 0; i <= 20; i++) {     // for(int i = 1; i <= 20; i += 2){ num = i*i;}
			if(i % 2 == 1){
				num += i * i;
			}
		}
		System.out.println(num);
		
		
		//3) 어떤 수가 소수(prime number: 1과 자기자신만을 약수로 갖는 수, 예: 2, 3, 5 …)인가를 판단하는 메소드 Boolean isPrime(int num); 를 만드세요
		int primeNum = 3;			// 1, 2, 3, 5, 7, 9 , 11....
		boolean Num = isPrime(primeNum);
		if(Num) {
			System.out.println(primeNum + " 소수");
		}else {
			System.out.println(primeNum + " 소수no");
		}
		
		int siu = 0;
		for(int i = 2; i <= 100; i ++ ) {
			if(isPrime(i)) {    //isPrime으로 아래 메소드 호출함
				siu += i;
			}
		}
		System.out.println(siu);
	}
	
	static Boolean isPrime(int num) {
		for(int i = 2; i <= num; i++ ) {    //for(int i = 2; i <= num -1; i++){if(num % i == 0){return false;}return true;}
			if(num % i == 0 && i != num) {
				return false;
			}
			if(num < 1) {
				return false;
			}
		}
		return true;
		
	}

}
				

