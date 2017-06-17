package com.mydomain;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

/**
 * Spin.java
 * Spins when behaviors of a higher priority are not initiated.
 * 2017/06/15
 * @author RohanZahid
 */
public class Spin implements Behavior {
	private boolean suppressed = false;
	
	/** 
	 * Takes control of the program.
	 * @return boolean true or false.
	 */ 
	@Override
	public boolean takeControl() {
			return true; //Returns true without conditions because it is the base behavior.
	}
	
	/** 
	 * Spins when control is achieved.
	 */ 
	@Override
	public void action() {
		Motor.B.stop(); //Stops motor B.
		Motor.C.backward(); //Rotates motor C backwards.
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
