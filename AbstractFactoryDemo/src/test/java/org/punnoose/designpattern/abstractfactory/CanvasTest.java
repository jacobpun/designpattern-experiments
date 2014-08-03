package org.punnoose.designpattern.abstractfactory;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CanvasTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testAbstractFactory() {
		
		final String CIRCLE = "circle";
		final String RECTANGLE = "rectangle";
		final String PRINTER_FRIENDLY = "printerfriendly";
		final String DISPLAY_FRIENDLY = "displayfriendly";
		
		Canvas canvas = new Canvas();
		canvas.addNewShape(RECTANGLE, PRINTER_FRIENDLY);
		canvas.addNewShape(CIRCLE, PRINTER_FRIENDLY);
		canvas.addNewShape(RECTANGLE, DISPLAY_FRIENDLY);
		canvas.addNewShape(CIRCLE, DISPLAY_FRIENDLY);
		
		final String DISPLAY_FRIENDLY_CIRCLE_CLASS_NAME = "org.punnoose.designpattern.abstractfactory.concreteshape.DisplayFriendlyCircle";
		final String PRINTER_FRIENDLY_CIRCLE_CLASS_NAME = "org.punnoose.designpattern.abstractfactory.concreteshape.PrinterFriendlyCircle";
		final String DISPLAY_FRIENDLY_RECTANGLE_CLASS_NAME = "org.punnoose.designpattern.abstractfactory.concreteshape.DisplayFriendlyRectangle";
		final String PRINTER_FRIENDLY_RECTANGLE_CLASS_NAME = "org.punnoose.designpattern.abstractfactory.concreteshape.PrinterFriendlyRectangle";
		
		assertThat(
				canvas.getShapesInCanvas(),
				containsInAnyOrder(
						hasProperty("class",hasProperty("name",is(DISPLAY_FRIENDLY_CIRCLE_CLASS_NAME))),
						hasProperty("class",hasProperty("name",is(PRINTER_FRIENDLY_CIRCLE_CLASS_NAME))),
						hasProperty("class",hasProperty("name",is(DISPLAY_FRIENDLY_RECTANGLE_CLASS_NAME))),
						hasProperty("class",hasProperty("name",is(PRINTER_FRIENDLY_RECTANGLE_CLASS_NAME)))
				));

	}
}