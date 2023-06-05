package MidtermReview.Assignment4.Task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phân tử của mảng: ");
        int arrayLength = scanner.nextInt();
        GeometricObject[] arr = new GeometricObject[arrayLength];
        for(int i=0; i<arrayLength; i++){

            System.out.println("Nhập lua chon: ");
            System.out.println("Nhập 1 Circle: ");
            System.out.println("Nhập 2 Rectangle: ");
            System.out.println("Nhập 3 Square: ");
            int chooseGeometric = scanner.nextInt();
            switch (chooseGeometric){
                case 1:
                    System.out.println("Nhập radius: ");
                    double radius = scanner.nextDouble();
                    arr[i] = new Circle(radius);
                    break;
                case 2:
                    System.out.println("Nhập width: ");
                    double width = scanner.nextDouble();
                    System.out.println("Nhập height: ");
                    double height = scanner.nextDouble();
                    arr[i] = new Rectangle(width, height);
                    break;
                case 3:
                    System.out.println("Nhập slide: ");
                    double slide = scanner.nextDouble();
                    arr[i] = new Square(slide);
                    break;
            }
        }
        scanner.close();
        System.out.println("tong dien tich la: " + MidtermReview.Assignment4.Task4.GeometricObject.sumArea(arr));

    }
}
