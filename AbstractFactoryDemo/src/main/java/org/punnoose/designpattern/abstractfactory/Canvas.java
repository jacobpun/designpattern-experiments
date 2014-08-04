package org.punnoose.designpattern.abstractfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.punnoose.designpattern.abstractfactory.abstractshape.Shape;
import org.punnoose.designpattern.abstractfactory.shapefactory.NullShapeFactory;
import org.punnoose.designpattern.abstractfactory.shapefactory.ShapeFactory;

public class Canvas {

	private ArrayList<Shape> shapesInCanvas = new ArrayList<Shape>();

	public void addNewShape(String shapeName, String displayName) {
		ShapeFactory factory = getFactory(formatAsKey(displayName));
		shapesInCanvas.add(factory.getShape(formatAsKey(shapeName)));
	}

	public List<Shape> getShapesInCanvas() {
		return Collections.unmodifiableList(shapesInCanvas);
	}

	private String formatAsKey(String displayName) {
		return displayName.toLowerCase().trim();
	}

	@SuppressWarnings("unchecked")
	private ShapeFactory getFactory(String displayName) {
		try {
			String factoryClassName = DisplayNameToFactoryClassNameMap.getFactoryClassName(displayName);
			Class<ShapeFactory> factoryClass = (Class<ShapeFactory>) Class.forName(factoryClassName);
			return factoryClass.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return new NullShapeFactory();
	}

	private static class DisplayNameToFactoryClassNameMap {
		@SuppressWarnings("serial")
		private static Map<String, String> shapeFactories = new HashMap<String, String>() {
			{
				put("printerfriendly", "org.punnoose.designpattern.abstractfactory.shapefactory.PrinterFriendlyShapeFactory");
				put("displayfriendly", "org.punnoose.designpattern.abstractfactory.shapefactory.DisplayFriendlyShapeFactory");
			}
		};

		private static String getFactoryClassName(String shapeName) {
			return shapeFactories.get(shapeName);
		}
	}
}