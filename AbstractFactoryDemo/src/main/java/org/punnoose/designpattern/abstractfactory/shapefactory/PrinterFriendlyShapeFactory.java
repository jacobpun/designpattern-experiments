package org.punnoose.designpattern.abstractfactory.shapefactory;

import java.util.HashMap;
import java.util.Map;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;
import org.punnoose.designpattern.abstractfactory.concreteshape.NullShape;

public class PrinterFriendlyShapeFactory extends ShapeFactory {

	@Override
	@SuppressWarnings("unchecked")
	public Shape getShape(String shapeName) {
		try {
			String factoryClassName = ShapeNameToFactoryClassNameMap.getFactoryClassName(shapeName);
			Class<Shape> factoryClass = (Class<Shape>) Class.forName(factoryClassName);
			return factoryClass.newInstance();
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
		private static Map<String, String> printerFriendlyShapes = new HashMap<String, String>() {
			{
				put("rectangle", "org.punnoose.designpattern.abstractfactory.concreteshape.PrinterFriendlyRectangle");
				put("circle", "org.punnoose.designpattern.abstractfactory.concreteshape.PrinterFriendlyCircle");
			}
		};

		private static String getFactoryClassName(String shapeName) {
			return printerFriendlyShapes.get(shapeName);
		}
	}
}