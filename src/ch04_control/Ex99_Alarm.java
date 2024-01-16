package ch04_control;

import java.util.Scanner;

public class Ex99_Alarm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시간입력> " );
		int hour = Integer.parseInt(scan.nextLine());
		System.out.println("분입력> " );
		int minute = Integer.parseInt(scan.nextLine());
		scan.close();
		
		
		int newHour = 0, newMin = 0;

		if(minute >= 45){
		    newHour = hour;
		    newMin = minute - 45;
		}else{
		    if (hour == 0){
		        newHour = 23;
		        newMin = minute + 60 - 45;
		    }else {
		        newHour = hour -1;
		        newMin = minute + 6- - 45;
		    }
		}
		System.out.println(hour, "시" , minute, "분" --> newHour, "시", newMin,"분" );
	
}
