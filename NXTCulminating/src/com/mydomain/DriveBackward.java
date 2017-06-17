package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * DriveBackward.java
 * Checks if the distance to the cup is within the acceptable range. If it is, the robot drives backward.
 * 2017/06/15
 * @author RohanZahid
 */
public class DriveBackward implements Behavior{
	private boolean suppressed = false;
	private UltrasonicSensor sonar;
	private LightSensor light;

	/** 
	 * Imports the UltrasonicSensor and LightSensor for use in this behavior.
	 * @param sonar, light
	 */ 
	public DriveBackward(UltrasonicSensor sonar, LightSensor light) {
		this.sonar = sonar;
		this.light = light;
	}

	/** 
	 * Takes control of the program if the UltrasonicSensor senses a distance less than 10 cm.
	 * @return boolean true or false.
	 */ 
	@Override
	public boolean takeControl() {
		if (sonar.getDistance() < 10) 
			return true;
		return false;
	}

	/** 
	 * Stops both motors. Turns around robot. Drives back to the starting position.
	 * @return void.
	 */ 
	@Override
	public void action() {
		Motor.B.stop(); //Stops motor B.
		Motor.C.stop(); //Stops motor C.
		Motor.C.rotate(720); //Rotates motor C 720 degrees.
		Motor.B.forward(); //Rotates motor B forward.
		Motor.C.forward(); //Rotates motor C forward.
		while (true) { //Repeats everything in the while loop until suppressed = true.
			if (light.readValue() < 38) {
				Delay.msDelay(300); //Delays the robot for 300 ms so it can continue into the taped area.
				Motor.C.stop(); //Stops motor C.
				Motor.B.stop(); //Stops motor B.
				Motor.C.rotate(180); //Rotates motor C 180 degrees.
				suppressed = true; //Suppresses the behavior.
			}
		}

	}
	
	/** 
	 * Suppresses behavior.
	 * @return void.
	 */ 
	@Override
	public void suppress() {
		suppressed = true;

	}

}
