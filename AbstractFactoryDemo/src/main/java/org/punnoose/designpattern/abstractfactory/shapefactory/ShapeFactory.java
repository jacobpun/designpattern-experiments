package org.punnoose.designpattern.abstractfactory.shapefactory;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;

public abstract class ShapeFactory {
	public abstract Shape getShape(String shapeName);
}