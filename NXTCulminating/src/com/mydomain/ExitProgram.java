package com.mydomain;
import lejos.nxt.Button;
import lejos.nxt.SoundSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
public class ExitProgram implements Behavior {
	private SoundSensor sound;
	public ExitProgram (SoundSensor sound) {
		this.sound = sound;
	}
	@Override
	public boolean takeControl() {
		if (sound.readValue() > 90)
			return true;
		return false;
	}

	@Override
	public void action() {
		System.exit(0);
		
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
