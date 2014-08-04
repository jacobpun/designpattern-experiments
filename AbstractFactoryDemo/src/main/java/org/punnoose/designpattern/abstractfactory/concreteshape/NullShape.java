package org.punnoose.designpattern.abstractfactory.concreteshape;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;

public class NullShape extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Null Shape");
	}
}
