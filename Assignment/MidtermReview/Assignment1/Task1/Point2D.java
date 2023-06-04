package MidtermReview.Assignment1.Task1;

public class Point2D {
    double x;
    double y;
    // Constructor
    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    // Distance
    public double Distance(double x, double y){
        return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
    }
    public double Distance(Point2D point){
        return (Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2)));
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    @Override
    public String toString(){
        return "Toa do: (x, y) = (" + getX() + "," + getY() + ")" +"Distance: x= 3 va y= 4 :" +  Distance(new Point2D(3, 4));
    }
    public static void main(String[] args){
        System.out.println("Task1");
        Point2D point = new Point2D(3, 4);
        System.out.println("X : " + point.getX());
        System.out.println("Y : " + point.getY());
        System.out.println("Distance : " + point.Distance(1, 2));
        System.out.println("Distance : " + point.Distance(new Point2D(1, 2)));


    }
}