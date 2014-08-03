package org.punnoose.designpattern.abstractfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.punnoose.designpattern.abstractfactory.shape.abstractshape.Shape;
import org.punnoose.designpattern.abstractfactory.shapefactory.NullShapeFactory;
import org.punnoose.designpattern.abstractfactory.shapefactory.ShapeFactory;

public class Canvas {

	@SuppressWarnings("serial")
	private Map<String, String> shapeFactories = new HashMap<String, String>() {
		{
			put("printerfriendly",
					"org.punnoose.designpattern.abstractfactory.shapefactory.PrinterFriendlyShapeFactory");
			put("displayfriendly",
					"org.punnoose.designpattern.abstractfactory.shapefactory.DisplayFriendlyShapeFactory");
		}
	};

	private ArrayList<Shape> shapesInCanvas = new ArrayList<Shape>();

	public void addNewShape(String shapeName, String displayName) {
		ShapeFactory factory = getFactory(displayName.toLowerCase().trim());
		shapesInCanvas.add(factory.getShape(shapeName.toLowerCase().trim()));
	}

	public List<Shape> getShapesInCanvas() {
		return Collections.unmodifiableList(shapesInCanvas);
	}

	private ShapeFactory getFactory(String displayName) {
		try {
			@SuppressWarnings("unchecked")
			Class<ShapeFactory> className = (Class<ShapeFactory>) Class
					.forName(shapeFactories.get(displayName));
			return className.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return new NullShapeFactory();
	}
}