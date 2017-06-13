package com.mydomain;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.addon.GyroSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

import java.util.ArrayList;
import java.util.Collections;

import lejos.robotics.subsumption.Behavior;
public class CheckDistance implements Behavior {
	private boolean suppressed = false;
	private UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);
	private GyroSensor gyro = new GyroSensor (SensorPort.S3);
	private ArrayList<Location> cups;
	@Override
	public boolean takeControl() {
	Delay.msDelay(200);
	return true;
	}

	@Override
	public void action() {
		Location location;
		if(sonar.getDistance() < 100)
			location = new Location(sonar.getDistance(), gyro.readValue());
		suppressed = true;

	}

	@Override
	public void suppress() {
		suppressed = true;

	}

}