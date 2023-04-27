package assignment4.Test4;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }

    public void printRectangle(){
        System.out.println("We are have a Rectangle: " +
                "\nWith: " + width +
                "\nHeight: " + height);
    }

}
