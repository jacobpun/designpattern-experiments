package org.punnoose.designpattern.abstractfactory.shapefactory;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;
import org.punnoose.designpattern.abstractfactory.concreteshape.NullShape;

public class NullShapeFactory extends ShapeFactory {

	@Override
	public Shape getShape(String shapeName) {
		return new NullShape();
	}

}
