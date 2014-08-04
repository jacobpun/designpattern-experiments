package org.punnoose.designpattern.abstractfactory.concreteshape;

import org.punnoose.designpattern.abstractfactory.abstractshape.PrinterFriendlyShape;

public class PrinterFriendlyRectangle extends PrinterFriendlyShape {
	@Override
	public void draw() {
		System.out.println("Drawing PrinterFriendlyRectangle");
	}
}