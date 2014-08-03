package org.punnoose.designpattern.abstractfactory.concreteshape;

import org.punnoose.designpattern.abstractfactory.shape.abstractshape.PrinterFriendlyShape;

public class PrinterFriendlyCircle extends PrinterFriendlyShape {
	@Override
	public void draw() {
		System.out.println("Drawing PrinterFriendlyCircle");
	}
}