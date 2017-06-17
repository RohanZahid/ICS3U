package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
 * MiningFinal.java
 * Executes Mining Simulator Software: Detects cups, goes to them, and goes back to the starting position.
 * 2017/06/15
 * @author RohanZahid
 */
public class MiningFinal {

	/**
	 * Declares sensors and behaviors used in the program.
	 * @return void.
	 */
	public static void main(String[] args) {
		UltrasonicSensor sonar = new UltrasonicSensor (SensorPort.S4);
		LightSensor light = new LightSensor (SensorPort.S2);
		SoundSensor sound = new SoundSensor (SensorPort.S3);
		Behavior b1 = new Spin();
		Behavior b2 = new CheckTape(light);
		Behavior b3 = new DriveForward(sonar, light);
		Behavior b4 = new DriveBackward(sonar, light);		
		Behavior b5 = new ExitProgram(sound);
		Behavior [] behaviors = {b1, b2, b3, b4, b5};
		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();
	}

}
