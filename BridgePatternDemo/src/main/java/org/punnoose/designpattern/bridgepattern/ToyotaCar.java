package org.punnoose.designpattern.bridgepattern;

public class ToyotaCar implements Car {
	private boolean isStarted = false;
	
	public void start() {
		isStarted = true;
		System.out.println("Toyota car starting");
	}

	public void stop() {
		isStarted = false;
		System.out.println("Toyota car stoping");
	}

	public boolean isStarted() {
		return isStarted;
	}
}
