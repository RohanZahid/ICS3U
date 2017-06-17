package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * CheckTape.java
 * Checks if tape is in the vicinity. If it is, the robot rotates.
 * 2017/06/15
 * @author RohanZahid
 */
public class CheckTape implements Behavior {
	private LightSensor light;
	private boolean suppressed = false;

	/** 
	 * Imports the LightSensor for use in this behavior.
	 * @param light
	 */ 
	public CheckTape(LightSensor light){
		this.light = light;
	}

	/** 
	 * Takes control of the program if the LightSensor senses the colour black.
	 * @return boolean true or false.
	 */ 
	@Override
	public boolean takeControl() {
		if (light.readValue() < 38){
			return true;
		}
		return false;
	}

	/** 
	 * Stops both motors. Rotates them separately to align with the black tape.
	 * @return void.
	 */ 
	@Override
	public void action() {
		Motor.B.stop(); //Stops motor B.
		Motor.C.stop(); //Stops motor C.
		while(light.readValue() < 38) {
			Motor.B.rotate(180); //Rotates motor B 180 degrees.
			Motor.C.rotate(-180); //Rotates motor C 180 degrees.
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
