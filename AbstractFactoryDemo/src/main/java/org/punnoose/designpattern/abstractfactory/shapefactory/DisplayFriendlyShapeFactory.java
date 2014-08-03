package org.punnoose.designpattern.abstractfactory.shapefactory;

import java.util.HashMap;
import java.util.Map;

import org.punnoose.designpattern.abstractfactory.concreteshape.NullShape;
import org.punnoose.designpattern.abstractfactory.shape.abstractshape.Shape;

public class DisplayFriendlyShapeFactory extends ShapeFactory {
	@SuppressWarnings("serial")
	private Map<String,String> displayFriendlyShapes = new HashMap<String,String>(){{
		put("rectangle","org.punnoose.designpattern.abstractfactory.concreteshape.DisplayFriendlyRectangle");
		put("circle","org.punnoose.designpattern.abstractfactory.concreteshape.DisplayFriendlyCircle");
	}};

	@Override
	public Shape getShape(String shapeName) {
		try {
			@SuppressWarnings("unchecked")
			Class<Shape> className = (Class<Shape>) Class.forName(displayFriendlyShapes.get(shapeName));
			return className.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return new NullShape();
	}
}