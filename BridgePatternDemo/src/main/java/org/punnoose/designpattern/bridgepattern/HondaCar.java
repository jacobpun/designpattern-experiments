package org.punnoose.designpattern.bridgepattern;

public class HondaCar implements Car {
	private boolean isStarted = false;

	public void start() {
		isStarted = true;
		System.out.println("Honda car starting");
	}

	public void stop() {
		isStarted = false;
		System.out.println("Honda car stoping");
	}

	public boolean isStarted() {
		return isStarted;
	}
	
}
