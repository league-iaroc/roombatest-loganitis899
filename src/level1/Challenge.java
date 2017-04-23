package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(800,800);
		sleep(1500);
		driveDirect(0,700);
		sleep(440);
		driveDirect(900,900);
		sleep(4000);
		driveDirect(0,700);
		sleep(440);
		driveDirect(900,900);
		
	}

	public void loop() {
	
	}
}
