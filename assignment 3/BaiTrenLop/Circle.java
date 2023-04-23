package BaiTrenLop;

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
	
	public void setRadius(double newradius) throws IllegalArgumentException {
		if(newradius > 0){
            radius = newradius;
        }
        else
        {
            throw new IllegalArgumentException("Radius cannot be nagative");
        }
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	public double getDIametter() {
		return 2*radius;
	}
	public void printCircle() {
		
	}
}
