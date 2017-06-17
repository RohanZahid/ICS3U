package com.mydomain;
import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

/**
 * ExitProgram.java
 * Checks if the ESCAPE button is pressed. If it is, the program is exited.
 * 2017/06/15
 * @author RohanZahid
 */
public class ExitProgram implements Behavior {
	
	/** 
	 * Takes control of the program if the ESCAPE button is pressed.
	 * @return boolean true or false.
	 */ 
	@Override
	public boolean takeControl() {
		if (Button.ESCAPE.isDown())
			return true;
		return false;
	}

	/** 
	 * Exits the program.
	 * @return void.
	 */ 
	@Override
	public void action() {
		System.exit(0);
		
	}

	/** 
	 * Suppresses behavior.
	 * @return void.
	 */ 
	@Override
	public void suppress() {
		
	}

}
