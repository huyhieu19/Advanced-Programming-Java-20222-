package assignment4.Test3;

import java.util.Random;
import java.util.Scanner;

/*
 * 3.	Viết chương trình đáp ứng các yêu cầu sau:   Tạo một mảng với 100 số nguyên được chọn ngẫu nhiên.
 *      Nhắc người dùng nhập chỉ số của mảng, sau đó hiển thị giá trị phần tử tương ứng.
 *      Nếu chỉ mục được chỉ định nằm ngoài giới hạn, hiển thị thông báo "Ngoài giới hạn". (Gợi ý: sử dụng lớp ngoại lệ ArrayIndexOutOfBoundsException)
 */
public class FindInArray {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arr = new int[100];
        for(int i=0; i<100; i++){
            arr[i] = rand.nextInt(1000);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id :");
        int index = scanner.nextInt();
        try {
            int value = arr[index];
            System.out.println("Value in index = " + index + " is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds of arrays" + e.toString());
        }
    }
}
