package com.mydomain;

import java.util.ArrayList;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.addon.GyroSensor;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;
public class DriveForward implements Behavior{

	private boolean suppressed = false;
	private UltrasonicSensor sonar;
	private LightSensor light;
	private int x;

	public DriveForward(UltrasonicSensor us, LightSensor ls, int x) {
		this.sonar = us;
		this.light = ls;
		this.x = x;
	}

	@Override
	public boolean takeControl() {
		if (sonar.getDistance() < 35 && sonar.getDistance() > 10)// && x == 0)
			return true;
		return false;
	}

	@Override
	public void action() {
		Motor.C.forward();
		Motor.B.forward();
	}







	@Override
	public void suppress() {
		suppressed = true;

	}

}
