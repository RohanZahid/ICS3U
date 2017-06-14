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
	public DriveForward(ArrayList<Location> cups) {
		this.cups = cups;
	}
	@Override
	public boolean takeControl() {
		if (Motor.C.getTachoCount() >= 1440)
			return true;
		return false;
	}/*
	public ArrayList sort(ArrayList list){

		if(list.size() <= 1){
			return list;
		}

		int middle = (int) Math.ceil((double)list.size() / 2);
		int pivot = ((Location) list.get(middle)).getDistance();

		ArrayList less = new ArrayList();
		ArrayList greater = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			if(((Location) list.get(i)).getDistance() <= pivot){
				if(i == middle){
					continue;
				}
				less.add(list.get(i));
			}
			else{
				greater.add(list.get(i));
			}
		}

		return concatenate(sort(less), (Location) list.get(middle), sort(greater));
	}

	private ArrayList concatenate(ArrayList less, Location middle, ArrayList greater){

		ArrayList list = new ArrayList();

		for (int i = 0; i < less.size(); i++) {
			list.add(less.get(i));
		}

		list.add(middle);
		for (int i = 0; i < greater.size(); i++) {
			list.add(greater.get(i));
		}

		return list;
		
	}*/
	@Override
	public void action() {
		Motor.C.resetTachoCount();
		Motor.B.resetTachoCount();
		//cups = sort(cups);
		int currentangle = 45; //cups.get(0).getAngle(); //to get the angle of the arraylist at spot 0
		int currentdistance = 10;//cups.get(0).getDistance();
		//cups.remove(0);
		Motor.C.rotateTo(currentangle*2);
		//Motor.B.rotateTo(currentangle*-1);
		Motor.C.forward();
		Motor.B.forward();
		while (sonar.getDistance() > currentdistance) {

		}
		Motor.C.stop();
		Motor.B.stop();
		Motor.C.backward();
		Motor.B.backward();
		while (sonar.getDistance() > currentdistance) {

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
