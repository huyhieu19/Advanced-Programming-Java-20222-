package MidtermReview.Assignment4.Task4;

import java.util.Date;

public class GeometricObject {
    private String color  = "white";
    private boolean filter;
    private Date dateCreated;
    public GeometricObject(){

    }
    public GeometricObject(String color, boolean filter){
        this.color = color;
        this.filter = filter;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilter(){
        return this.filter;
    }
    public void setFilter(boolean filter){
        this.filter = filter;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "Geometric: filter: " + this.filter + ", Color: " + this.color + ", DateCreated: " + this.dateCreated;
    }

    public static double  sumArea(GeometricObject[] geometricObjects){
        double sum = 0;
        for(GeometricObject geometricObject : geometricObjects){
            if(geometricObject.getClass() == Circle.class){
                sum += ((Circle) geometricObject).getArea();
            }
            else if(geometricObject.getClass() == Square.class){
                sum += ((Square) geometricObject).getArea();
            }
            else if(geometricObject.getClass() == Rectangle.class){
                sum += ((Rectangle) geometricObject).getArea();
            }
        }
        return sum;
    }
}
