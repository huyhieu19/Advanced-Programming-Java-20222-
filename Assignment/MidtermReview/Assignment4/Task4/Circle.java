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

}
