package assignment4.Test4;

public class Main {
    public static void main(String[] args){
        GeometricObject geometricObject =  new GeometricObject("red", true);
        GeometricObject square = new Square("String color", true, 5);

        System.out.println(square.toString());;
    }
}
