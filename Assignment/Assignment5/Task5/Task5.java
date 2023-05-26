package Assignment5.Task5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Task5 {
    public static void main(String[] args){
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        Date date = new Date();
        double valueDouble = 5.5;
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Ex5.dat"))){
            for(int number : numbers){
                dataOutputStream.writeInt(number);
            }
            dataOutputStream.writeLong(date.getTime());
            dataOutputStream.writeDouble(valueDouble);
            System.out.println("Đã lưu dữ liệu vào tệp Ex5.dat");
        }catch (IOException ex){
            System.out.print("Đã xảy ra lỗ khi lưu dữ liệu vào tệp Ex5.dat");
        }
    }
}
