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
	private UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);
	private GyroSensor gyro = new GyroSensor (SensorPort.S3);
	private LightSensor light = new LightSensor (SensorPort.S2);
	public Spin(ArrayList<Location> cups) {
		this.cups = cups;
	}
	private ArrayList<Location> cups;
	
	
	@Override
	public boolean takeControl() {
		if (light.readValue()<36)
			return true;
		return false;
	}

	@Override
	public void action() {
		LCD.drawString("Program 2", 0, 0);
		Motor.C.rotate(1440, true);
		while (Motor.C.getTachoCount() < 1440) {
		if(sonar.getDistance() < 60)
			new Location(sonar.getDistance(), gyro.readValue());
		}
		LCD.drawInt(Motor.C.getTachoCount(), 0, 1);
		
	}

	@Override
	public void suppress() {

	}

}
