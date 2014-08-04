package org.punnoose.designpattern.abstractfactory.shapefactory;

import java.util.HashMap;
import java.util.Map;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;
import org.punnoose.designpattern.abstractfactory.concreteshape.NullShape;

public class PrinterFriendlyShapeFactory extends ShapeFactory {
	private Map<String,String> printerFriendlyShapes = new HashMap<String,String>(){{
		put("rectangle","org.punnoose.designpattern.abstractfactory.concreteshape.PrinterFriendlyRectangle");
		put("circle","org.punnoose.designpattern.abstractfactory.concreteshape.PrinterFriendlyCircle");
	}};

	@Override
	public Shape getShape(String shapeName) {
		try {
			Class<Shape> className = (Class<Shape>) Class.forName(printerFriendlyShapes.get(shapeName));
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