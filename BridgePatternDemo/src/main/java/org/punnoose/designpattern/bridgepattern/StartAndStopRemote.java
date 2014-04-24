package org.punnoose.designpattern.bridgepattern;

public class StartAndStopRemote implements Remote{
	private Car car;

	public StartAndStopRemote(Car car){
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void startCar() {
		car.start();
		
	}

	public void stopCar() {
		car.stop();
	}
}
