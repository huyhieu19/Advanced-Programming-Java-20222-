package assignment4.Test4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // tạo 1 mảng với N số phần tử
        // Khởi tạo các phẩn từ cho mảng đó
        // In diện tích và thông tin các hình sau đó tính tổng
        // Hiện tổng

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số phân tử của mảng: ");
            int arrayLength = scanner.nextInt();
            GeometricObject[] arr = new GeometricObject[arrayLength];
            System.out.println("Tao cac hinh: " +
                    "\n Square: an phim 1:" +
                    "\n Circle: an phim 2:" +
                    "\n Rectangle: an phim 3");

            for(int i=0; i<arrayLength; i++) {
                try {
                    System.out.println("Chon hinh: ");
                    int choose = scanner.nextInt();
                    if (choose > 0 && choose < 4) {
                        switch (choose) {
                            case 1:
                                System.out.println("Tạo 1 hình Vuông: Nhập số đo cạnh: ");
                                double slide = scanner.nextDouble();
                                arr[i] = new Square(slide);
                                break;
                            case 2:
                                System.out.println("Tạo 1 hình tròn: Nhập số đo bán kinh: ");
                                double radius = scanner.nextDouble();
                                arr[i] = new Circle(radius);
                                break;
                            case 3:
                                System.out.println("Tạo 1 hình tròn: \nNhập số đo chiều rộng: ");
                                double width = scanner.nextDouble();
                                System.out.println("Nhập chiều dài: ");
                                double length = scanner.nextDouble();
                                arr[i] = new Rectangle(width, length);
                                break;
                        }
                    }
                } catch (Exception ex) {
                    System.out.println("Vui long nhap dung: hay nhap lai");
                }
            }
            scanner.close();
            System.out.println("Tổng Diện tích: ");
            System.out.println(GeometricObject.sumArea(arr));;
        }catch (Exception exception){
            System.out.println("Xay ra loi : " + exception.toString());
        }
    }
}
