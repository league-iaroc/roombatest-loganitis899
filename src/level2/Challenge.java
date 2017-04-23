package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed=500;
	
	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}
	void goStrait(int dur){
		driveDirect(speed,speed);
		sleep(dur);}
	public Challenge(Roomba roomba) {

		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		goStrait(2700);
		driveDirect(0,500);
		sleep(500);
		goStrait(5000);
		driveDirect(700,0);
		sleep(300);
		goStrait(5000);

	}

	public void loop() {
	
	}
	
	}

