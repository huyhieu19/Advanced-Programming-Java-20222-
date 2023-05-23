package Assignment5.Task4;

import java.io.*;
import java.util.Random;

public class CreateTask4 {
    public static void main(String[] args){
        String fileName = "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment5\\Task4\\Ass5_Ex4.dat";
        try{
            FileOutputStream outputStream = new FileOutputStream(fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);

            String data = "";
            Random random = new Random();
            for(int i=0; i<150; i++){
                double integerRandom = 10*random.nextDouble();
                dataOutputStream.writeDouble(integerRandom);
            }
            dataOutputStream.close();
            System.out.println("Dữ liệu đã được ghi vào tệp: " + fileName);

            try (DataInputStream input = new DataInputStream(new FileInputStream(fileName))) {
                double total = 0;
                System.out.println("Dữ liệu trong tệp: ");
                while (input.available() > 0) {
                    double number = input.readDouble();
                    System.out.println(number);
                    total += number;
                }
                double average = total/150;
                System.out.println("The calculated average: "+ average);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }catch (IOException e) {
            System.out.println("An error occurred while writing data to the file.");
            e.printStackTrace();
        }
    }
}
