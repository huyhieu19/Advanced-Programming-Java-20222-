package Assignment5.Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateFile {
    public static void main(String[] args){
        String fileName = "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment5\\Task2\\Ass5_Ex2.txt";
        File file = new File(fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("New file created: " + fileName);
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // generate 150 random number
            Random random = new Random();
            String stringWriten = "";
            for(int i=0; i<150; i++){
                int randomNumber = random.nextInt();
                String write = randomNumber + " ";
                stringWriten += write;
            }
            bufferedWriter.write(stringWriten);
            bufferedWriter.close();
            System.out.println("Data that has been written to the file: " + fileName);

        }catch (IOException e) {
            System.out.println("An error occurred while writing data to the file.");
            e.printStackTrace();
        }
    }
}
