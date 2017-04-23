package level3;


import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
static int speed=500;
static int sped=700;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}
	void goStrait(int dur){
		driveDirect(speed,speed);
		sleep(dur);}
	void goLeft(int durr){
		driveDirect(0,sped);
		sleep(durr);
	}
	void goRight(int durrr){
		driveDirect(sped,0);
		sleep(durrr);
		
	}
	
	
	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		goStrait(2000);
		goLeft(300);
		goStrait(2000);
		goRight(300);
		goStrait(2200);
		goLeft(300);
		goStrait(2000);
		goRight(300);
		goStrait(5000);
	
	}

	public void loop() {
	
	}
}
