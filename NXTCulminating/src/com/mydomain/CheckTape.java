package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class CheckTape implements Behavior {
	private LightSensor light;
	private boolean suppressed = false;

	public CheckTape(LightSensor light){
		this.light = light;
	}
	
	@Override
	public boolean takeControl() {
		if (light.readValue() < 38){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		//Delay.msDelay(200);
		Motor.B.stop();
		Motor.C.stop();
		while(light.readValue() < 38) {
			Motor.B.rotate(180);
			Motor.C.rotate(-180);
		}
		//Motor.C.rotate(-180);
	}

	@Override
	public void suppress() {
		suppressed = true;
		
	}

}
