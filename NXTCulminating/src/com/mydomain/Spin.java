package com.mydomain;

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
	private LightSensor light = new LightSensor (SensorPort.S2);
	private ArrayList<Location> cups;
	public Spin(ArrayList<Location> cups) {
		this.cups = cups;
	}
	
	@Override
	public boolean takeControl() {
		if (light.readValue()<34)
			return true;
		return false;
	}

	@Override
	public void action() {
		Motor.C.rotate(360);
		Motor.B.rotate(360);
	}

	@Override
	public void suppress() {
		suppressed = true;

	}

}
