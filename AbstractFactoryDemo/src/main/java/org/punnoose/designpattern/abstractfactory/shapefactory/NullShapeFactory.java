package org.punnoose.designpattern.abstractfactory.shapefactory;

import org.punnoose.designpattern.abstractfactory.concreteshape.NullShape;
import org.punnoose.designpattern.abstractfactory.shape.abstractshape.Shape;

public class NullShapeFactory extends ShapeFactory {

	@Override
	public Shape getShape(String shapeName) {
		return new NullShape();
	}

}
