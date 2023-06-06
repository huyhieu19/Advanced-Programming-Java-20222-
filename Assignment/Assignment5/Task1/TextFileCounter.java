package Assignment5.Task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class  TextFileCounter {
    public static void main(String[] args){
        // When running the program, please change the file path
        String filePath = "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment5\\Task1\\task1.txt";
        try(BufferedReader reader = new BufferedReader((new FileReader(filePath)))){
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;
            while((line= reader.readLine())!= null){
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Character count: " + charCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
