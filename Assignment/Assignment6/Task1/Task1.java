package Assignment6.Task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args){
        String fileName = "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment6\\Task1\\Task1.txt";
        List<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                String[] lineWords = line.split("\\s+");
                for(String word : lineWords){
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("Không tìm thấy tệp " + fileName);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
        Collections.sort(words);

        System.out.println("Danh sách từ theo thứ tự bảng chữ cái tăng dần:");
        for (String word : words) {
            System.out.print(word +  " ");
        }

        Collections.sort(words, Collections.reverseOrder());
        System.out.println("\nDanh sách từ theo thứ tự bảng chữ cái giảm dần:");
        for (String word : words) {
            System.out.print(word + " ");
        }

    }
}
