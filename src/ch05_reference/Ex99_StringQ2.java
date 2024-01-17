package ch05_reference;

public class Ex99_StringQ2 {

	public static void main(String[] args) {
		// 2. 디지텔 시계, 00:00 ~ 23:59
		// 하루동안 3이 표시되는 시간은 몇초인가?
		int t = 0;
		for( int h = 0; h < 24; h++){
		    for(int m = 0; m < 60; m++){
		        
		            String c =" h + ':' + m";
		            if(c.indexOf('3') >= 0)
		                 t += 60;
		    }
		}
		    System.out.println("하루동안 3인 표시되는 시간은" + t + "초 입니다" );
		}
	}


