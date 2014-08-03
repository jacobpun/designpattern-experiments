package org.punnoose.designpattern.observerpattern;

public class Circle extends Shape {

	private long radius;
	private Point2D center;

	public Circle() {
		this(0, 0, 0);
	}

	public Circle(int x, int y, long radius) {
		this.center = new Point2D(x, y);
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}

	public long getRadius() {
		return radius;
	}

	public void setRadius(long radius) {
		this.radius = radius;
		setChanged();
		notifyObservers("Radius changed to " + radius);
	}

	public Point2D getCenter() {
		return center;
	}

	public void setCenter(Point2D center) {
		this.center = center;
		setChanged();
		notifyObservers("Center changed to " + center);
	}

	@Override
	public String toString() {
		return "Center: " + getCenter() + ", Radius: " + getRadius();
	}
}