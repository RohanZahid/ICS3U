package com.mydomain;

import java.util.ArrayList;
import java.util.List;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class MiningFinal {

	public static void main(String[] args) {
		
		ArrayList<Location> cups = new ArrayList<Location>();
		Behavior b1 = new Spin(cups);
		Behavior b2 = new CheckDistance();
		Behavior b3 = new DriveForward();
		Behavior [] behaviors = {b1, b2, b3};
		
		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();

	}

}
