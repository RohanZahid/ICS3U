package com.mydomain;

import java.util.ArrayList;
import java.util.List;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class MiningFinal {

	public static void main(String[] args) {
		
		ArrayList<Location> cups = new ArrayList<Location>();
		Behavior b1 = new Spin(cups);//(cups);
		//Behavior b2 = new CheckDistance(cups);
		Behavior b3 = new DriveForward(cups);
		Behavior b4 = new ExitProgram();
		Behavior [] behaviors = {b1, b3, b4};
		
		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();

	}

}
