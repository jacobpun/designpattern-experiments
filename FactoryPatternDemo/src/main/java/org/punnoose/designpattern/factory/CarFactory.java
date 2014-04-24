package org.punnoose.designpattern.factory;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private Map<String, String> cars = new HashMap<>();
	
	public CarFactory(){
		cars.put("Toyota", "org.punnoose.designpattern.factory.ToyotaCar");
		cars.put("Honda", "org.punnoose.designpattern.factory.HondaCar");
	}
			
	public Car createCar(String carType){
		String className = cars.get(carType);
		System.out.println("Class Name: " + className);
		try {
			Class<Car> classObj= (Class<Car>)Class.forName(className);
			return classObj.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return new NullCar();
	}
}
