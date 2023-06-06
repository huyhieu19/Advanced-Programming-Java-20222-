package MidtermReview.Assignment4.Task4;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filter){
        super(color, filter);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2*3.14*this.radius;
    }
    public double getDiameter(){
        return 2*this.radius;
    }
    public void PrintCircle(){
        System.out.println("Circle: \n" +
                "Radius: " + this.radius +"\n" +
                "Area: " + this.getArea()+ "\n" +
                "Perimeter: " + this.getPerimeter() + "\n" +
                "Diameter: " + this.getDiameter());
    }
}
