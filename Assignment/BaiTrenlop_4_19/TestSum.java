package BaiTrenlop_4_19;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TestSum {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        try {
            num1 = scanner.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Please input integer.");
            scanner.nextLine();
            return;
        }

        System.out.print("Enter number 2: ");
        try {
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please input integer.");
            scanner.nextLine();
            return;
        }

        int sum = num1 + num2;
        System.out.println("Total of two numbers is: " + sum);
        scanner.close();
    }
}
