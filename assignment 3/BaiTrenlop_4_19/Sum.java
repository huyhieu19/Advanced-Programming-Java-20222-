package BaiTrenlop_4_19;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        try {
            num1 = scanner.nextInt();
        } 
        catch 
        (InputMismatchException e) {
            System.out.println("Vui lòng nhập số nguyên.");
            scanner.nextLine();
            return;
        }
    }
    System.out.print("Nhập số thứ hai: ");
        try {
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Vui lòng nhập số nguyên.");
            scanner.nextLine(); // xóa bộ đệm đầu vào
            return;
        }

        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
        scanner.close();
}
