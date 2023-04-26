package assignment4.Test4;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreate;

	public GeometricObject() {
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		filled = true;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public String toString() {
		return "Color : " + color + "\nFilled : " + filled;
	}

	public double sumArea(GeometricObject[] a){
		double sum = 0;
		for (GeometricObject x: a) {

		}
		return sum;
	}
}
