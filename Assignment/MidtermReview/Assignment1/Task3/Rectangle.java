package MidtermReview.Assignment1.Task3;
public class Rectangle {
    double width;
    double height;
    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return 2*(this.height + this.width);
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2, 3);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("getPerimeter: " + rectangle.getPerimeter());

    }

}
