package assignment4.Test4;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius , String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14*radius*radius;
	}

	public double getPerimeter() {
		return 2*3.14*radius;
	}

	public double getDiameter() {
		return 2*radius;
	}

	public void printCircle() {
		System.out.println("We are have one Circle:" +
				"\nRadius: " + radius);
	}
}
