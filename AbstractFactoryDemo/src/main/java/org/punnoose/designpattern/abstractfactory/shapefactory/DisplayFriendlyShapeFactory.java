package org.punnoose.designpattern.abstractfactory.shapefactory;

import java.util.HashMap;
import java.util.Map;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;
import org.punnoose.designpattern.abstractfactory.concreteshape.NullShape;

public class DisplayFriendlyShapeFactory extends ShapeFactory {

	@Override
	@SuppressWarnings("unchecked")
	public Shape getShape(String shapeName) {
		try {
			String className= ShapeNameToFactoryClassNameMap.getFactoryClassName(shapeName);
			Class<Shape> classObject = (Class<Shape>) Class.forName(className);
			return classObject.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return new NullShape();
	}
	
	private static class ShapeNameToFactoryClassNameMap {
		@SuppressWarnings("serial")
		private static Map<String,String> displayFriendlyShapes = new HashMap<String,String>(){{
			put("rectangle","org.punnoose.designpattern.abstractfactory.concreteshape.DisplayFriendlyRectangle");
			put("circle","org.punnoose.designpattern.abstractfactory.concreteshape.DisplayFriendlyCircle");
		}};

		private static String getFactoryClassName(String shapeName) {
			return displayFriendlyShapes.get(shapeName);
		}
	}
}