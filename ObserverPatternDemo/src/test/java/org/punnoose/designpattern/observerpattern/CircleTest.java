package org.punnoose.designpattern.observerpattern;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CircleTest {

	@Test
	public void test() {
		ShapeAudit audit = new ShapeAudit();
		Circle circle = new Circle(10,20,30);
		circle.addObserver(audit);
		circle.setRadius(50);
		circle.setCenter(new Point2D(5,5));
		assertThat(audit.getauditMessages(), hasItem("Radius changed to 50"));
	}
}