package MidtermReview.Assignment4.Task2;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandomValue {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri  can tim");
        int id = scanner.nextInt();
        try{
            System.out.println("Gia tri cua mang la: " + array[id]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("gia tri nhap nam ngoai pham vi mang");
            System.out.println(ex.toString());
        }

    }
}
