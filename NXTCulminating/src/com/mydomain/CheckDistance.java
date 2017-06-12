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
	private UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S2);
	private GyroSensor gyro = new GyroSensor (SensorPort.S3);
	private ArrayList<Location> cups;
	@Override
	public boolean takeControl() {
	Delay.msDelay(100);
	return true;
	}

	@Override
	public void action() {
		Location location;
		if(sonar.getDistance() < 100)
			location = new Location(sonar.getDistance(), gyro.readValue());
		
		Collections.sort(cups);
		int currentangle = cups.get(0).getAngle(); //to get the angle of the arraylist at spot 0
		cups.remove(0); // to remove the location from the arraylist

	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}

}