package org.punnoose.designpattern.abstractfactory.concreteshape;

import org.punnoose.designpattern.abstractfactory.shape.abstractshape.DisplayFriendlyShape;

public class DisplayFriendlyRectangle extends DisplayFriendlyShape {
	@Override
	public void draw() {
		System.out.println("Drawing DisplayFriendlyRectangle");
	}
}