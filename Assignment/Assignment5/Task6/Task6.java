package Assignment5.Task6;

import java.io.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        System.out.println("Nhap ten tep: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        // dùng bufferedReader để đọc từng hàng
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            int count = 0;
            double totalScore = 0;
            while((line = bufferedReader.readLine()) != null){
                String[] scores = line.split(" ");
                for(String score : scores){
                    totalScore += Double.parseDouble(score);
                    count++;
                }
            }
            double averageScore = totalScore/count;
            System.out.println("Tổng điểm: " + totalScore);
            System.out.println("Điểm trung bình: " + averageScore);
        }
        catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp " + fileName);
        }
            catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp " + fileName + ": " + e.getMessage());
        }
    }
}
