package com.mydomain;

import java.util.Collections;
import java.util.ArrayList;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.nxt.UltrasonicSensor;
public class DriveForward implements Behavior{
private boolean suppressed = false;
private UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);
private LightSensor light = new LightSensor (SensorPort.S2);
private ArrayList<Location> cups;
	@Override
	public boolean takeControl() {
		if (Motor.C.getTachoCount() >= 360)
			return true;
		return false;
	}

	@Override
	public void action() {
		//Collections.sort(cups);
		int currentangle = cups.get(0).getAngle(); //to get the angle of the arraylist at spot 0
		int currentdistance = cups.get(0).getDistance();
		cups.remove(0);
		Motor.C.rotateTo(currentangle);
		Motor.B.rotateTo(currentangle);
		Motor.C.forward();
		Motor.B.forward();
		while (sonar.getDistance() > currentdistance + 4) {
			
		}
		Motor.C.stop();
		Motor.B.stop();
		Motor.C.backward();
		Motor.B.backward();
		while (light.readValue() < 33) {
			
		}
		Motor.C.stop();
		Motor.B.stop();
		Motor.C.resetTachoCount();
		Motor.B.resetTachoCount();
		
	}

	@Override
	public void suppress() {
		suppressed = true;
		
	}

}
