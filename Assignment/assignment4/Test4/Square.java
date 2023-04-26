package assignment4.Test4;

public class Square extends GeometricObject{
    private double slide;

    public Square(){}
    public Square(double slide){
        this.slide = slide;
    }

    public Square(String color, boolean filled, double slide) {
        super(color, filled);
        this.slide = slide;
    }

    public double getSlide() {
        return slide;
    }

    public void setSlide(double slide) {
        this.slide = slide;
    }

    public double getArea() {
        return slide*slide;
    }
    public double getPerimeter() {
        return 4*slide;
    }
    public void printSquare(){
        System.out.println("Square: " +
                "\nSlide: " +slide);
    }
}
