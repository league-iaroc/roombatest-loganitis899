package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed=500;
	static int sped=700;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);}
	
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
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
goStrait(5000);
goLeft(300);
goStrait(5000);
	}

	public void loop() {
		if(rightBump){
		goRight(100);
		goStrait(1);
	
		
		
		rightBump=false;
		leftBump=false;
			
		}
		if(leftBump){
			goLeft(100);
			goStrait(1);
			
			rightBump=false;
			leftBump=false;

	}}
}
