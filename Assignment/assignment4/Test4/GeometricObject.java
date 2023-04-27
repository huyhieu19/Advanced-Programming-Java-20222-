package assignment4.Test4;

import java.awt.*;
import java.sql.SQLOutput;
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

	public static double sumArea(GeometricObject[] a){
		double sum = 0;
		for (GeometricObject x: a) {
			if(x.getClass() == Square.class){
				sum += ((Square) x).getArea();
			}else if(x.getClass() == Rectangle.class){
				sum += ((Rectangle) x).getArea();
			}else if(x.getClass() == Circle.class){
				sum += ((Circle) x).getArea();
			}else{
				System.out.println("Lớp con không đúng kiểu: Đã có lỗi trong khi tạo mảng!!!");
			}
		}
		return sum;
	}
}
