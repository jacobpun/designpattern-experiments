package org.punnoose.designpattern.observerpattern;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testObserver() {
		final int X_AXIS = 10;
		final int Y_AXIS = 20;
		final int RADIUS = 30;
		final int NEW_RADIUS = 50;

		ShapeAudit audit = new ShapeAudit();
		Circle circle = new Circle(X_AXIS,Y_AXIS,RADIUS);
		circle.addObserver(audit);
		circle.setRadius(NEW_RADIUS);
		assertThat(audit.getauditMessages(), hasItem("Radius changed to " + NEW_RADIUS));
	}
}