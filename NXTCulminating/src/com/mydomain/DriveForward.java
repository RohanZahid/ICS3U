package com.mydomain;

import lejos.nxt.UltrasonicSensor;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

/**
 * DriveForward.java
 * Checks if the distance to the cup is within the acceptable range. If it is, the robot drives forward.
 * 2017/06/15
 * @author RohanZahid
 */
public class DriveForward implements Behavior{
	private boolean suppressed = false;
	private UltrasonicSensor sonar;
	private LightSensor light;

	/** 
	 * Imports the UltrasonicSensor and LightSensor for use in this behavior.
	 * @param sonar, light
	 */ 
	public DriveForward(UltrasonicSensor sonar, LightSensor light) {
		this.sonar = sonar;
		this.light = light;
	}

	/** 
	 * Takes control of the program if the UltrasonicSensor senses a distance less than 35 cm and more than 10 cm.
	 * @return boolean true or false.
	 */ 
	@Override
	public boolean takeControl() {
		if (sonar.getDistance() < 35 && sonar.getDistance() > 10) {
			return true;
		}
		return false;
	}
	
	/** 
	 * Outputs the distance. Moves the robot forward.
	 * @return void.
	 */ 
	@Override
	public void action() {
		LCD.drawInt(sonar.getDistance(), 0, 0); //Outputs the distance to the screen.
		Motor.C.forward(); //Rotates motor C forward.
		Motor.B.forward(); //Rotates motor B forward.
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
