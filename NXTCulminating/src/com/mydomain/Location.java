package com.mydomain;

public class Location implements Comparable  {
	private int distance;
	private int angle;
	
	public Location() {
		setDistance(0);
		setAngle(0);
	}
	
	public Location(int x, int a) {
		setDistance(x);
		setAngle(a);
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	@Override
	public int compareTo(Object o) {
		if(this.distance < ((Location)o).getDistance())
			return -1;
		else if (this.distance > ((Location)o).getDistance())
			return 1;
		else
			return 0;
	}
	
	
	
}
