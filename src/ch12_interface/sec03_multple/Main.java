package ch12_interface.sec03_multple;

import ch12_interface.sec02_interface.RemoteControllable;

public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable sc = new SmartTV();
		sc.search("www.youtube.com");
		
		SmartTV stv = new SmartTV();
		stv.turnOn();
		stv.setVolume(5);
		stv.search("www.naver.com");
		stv.turnOff();
	}
	
}
				

			
