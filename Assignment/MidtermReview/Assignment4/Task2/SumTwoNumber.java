package MidtermReview.Assignment4.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;
        int number1 = 0;
        int number2 = 0;
        while(!isNumber){
            try{
                System.out.println("Nhap so nguyen: ");
                 number1 = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException ex){
                System.out.println("Vui long nhap dung so nguyen");
            }
        }
        isNumber = false;
        while(!isNumber){
            try{
                System.out.println("Nhap so nguyen: ");
                 number2 = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException ex){
                System.out.println("Vui long nhap dung so nguyen");
            }
        }
        System.out.println("Tong hai so sau khi nhap la: " + (number1 + number2));
    }
}
