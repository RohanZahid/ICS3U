package com.mydomain;

import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.addon.GyroSensor;
import lejos.robotics.subsumption.Behavior;
import java.util.ArrayList;
import lejos.robotics.subsumption.Behavior;
public class Spin implements Behavior {
	private boolean suppressed = false;
	
	@Override
	public boolean takeControl() {
			return true;
	}

	@Override
	public void action() {
		//LCD.drawString("Program 2", 0, 0);
		Motor.C.backward();
	}

	@Override
	public void suppress() {
		suppressed = true;

	}

}
