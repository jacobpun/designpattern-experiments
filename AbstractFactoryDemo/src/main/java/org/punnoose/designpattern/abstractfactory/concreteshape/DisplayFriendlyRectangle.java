package org.punnoose.designpattern.abstractfactory.concreteshape;

import org.punnoose.designpattern.abstractfactory.abstractshape.DisplayFriendlyShape;

public class DisplayFriendlyRectangle extends DisplayFriendlyShape {
	@Override
	public void draw() {
		System.out.println("Drawing DisplayFriendlyRectangle");
	}
}
