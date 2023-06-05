package MidtermReview.Assignment4.Task4;

public class Square extends GeometricObject{
    private double slide;
    public Square(){}
    public Square(double slide){
        this.slide = slide;
    }
    public Square(double slide, boolean filter, String color){
        super(color, filter);

    }

    public double getSlide() {
        return slide;
    }

    public void setSlide(double slide) {
        this.slide = slide;
    }
    public double getArea(){
        return this.slide * this.slide;
    }
    public double getPerimeter(){
        return 4*this.slide;
    }
    public void printSquare(){
        System.out.println("Square: \n" +
                "Area: " + this.getArea() + "\n" +
                "Perimeter: " + this.getPerimeter() + "\n");
    }
}
