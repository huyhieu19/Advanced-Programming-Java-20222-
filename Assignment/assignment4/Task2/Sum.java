package assignment4.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 2.	Viết chương trình nhắc người dùng đọc hai số nguyên và hiển thị tổng của chúng.
 *      Chương trình của bạn sẽ nhắc người dùng đọc lại số nếu đầu vào không chính xác. (Gợi ý:sử dụng lớp ngoại lệ InputMismatchException)
 */

public class Sum {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isNumber  = false;
        while(!isNumber) {
        	try {
        		System.out.print("Enter number 1: ");
        		num1 = scanner.nextInt();
        		isNumber  = true;
        	} catch (InputMismatchException e) {
        		System.out.println("Please input integer.");
        		scanner.nextLine();
        	}
        	
        }
        do {
        	try {
        		System.out.print("Enter number 2: ");
        		num2 = scanner.nextInt();
        		isNumber  = true;
        	} catch (InputMismatchException e) {
        		System.out.println("Please input integer.");
        		scanner.nextLine();
        		return;
        	}
        }while(!isNumber);
        scanner.close();
        int sum = num1 + num2;
        System.out.println("Total of two numbers is: " + sum);
    }
}