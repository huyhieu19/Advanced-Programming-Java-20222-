package Assignment5.Task3;

import java.io.*;
import java.util.Random;

public class CreateWriteFile {
    public static void main(String[] args){
        String fileName = "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment5\\Task3\\Ass5_Ex3.dat";
        try{
            FileOutputStream outputStream = new FileOutputStream(fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);

            String data = "";
            Random random = new Random();
            for(int i=0; i<150; i++){
                int integerRandom = random.nextInt();
                dataOutputStream.writeInt(integerRandom);
            }
            dataOutputStream.close();
            System.out.println("Dữ liệu đã được ghi vào tệp: " + fileName);
        }catch (IOException e) {
            System.out.println("An error occurred while writing data to the file.");
            e.printStackTrace();
        }
    }
}
