package org.punnoose.designpattern.observerpattern;

import java.util.Observable;

public abstract class Shape extends Observable {
	abstract double getArea();
}