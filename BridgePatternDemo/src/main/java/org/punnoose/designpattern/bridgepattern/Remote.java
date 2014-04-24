package org.punnoose.designpattern.bridgepattern;

public interface Remote {
	public Car getCar();
	public void setCar(Car car);
	public void startCar();
	public void stopCar();
}