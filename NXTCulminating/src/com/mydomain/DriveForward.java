package com.mydomain;

import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior{
private boolean suppressed = false;
	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppress() {
		suppressed = true;
		
	}

}
