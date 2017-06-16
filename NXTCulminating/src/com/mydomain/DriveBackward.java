package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class DriveBackward implements Behavior{
	private boolean suppressed = false;
	private int x;
	private UltrasonicSensor sonar;
	private LightSensor light;
	public DriveBackward(UltrasonicSensor sonar, LightSensor light, int x) {
		this.sonar = sonar;
		this.light = light;
		this.x = x;
	}

	@Override
	public boolean takeControl() {
		if (sonar.getDistance() < 10) 
			return true;
		return false;
	}
	@Override
	public void action() {
		Motor.B.stop();
		Motor.C.stop();
		Motor.C.rotate(720);
		Motor.B.forward();
		Motor.C.forward();
		while (true) {
			if (light.readValue() < 38) {
				//
				Delay.msDelay(300);
				Motor.C.stop();
				Motor.B.stop();
				Motor.C.rotate(180);
				suppressed = true;
				break;
			}
		}

	}
	@Override
	public void suppress() {
		suppressed = true;

	}

}
