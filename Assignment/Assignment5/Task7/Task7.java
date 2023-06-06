package Assignment5.Task7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task7 {
    public static void main(String[] args){
        String fileName = "Salary.txt";
        String[] ranks = {"assistant", "teacher", "associate"};
        int[][] salaryRange = {{50000, 80000}, {60000, 110000}, {75000, 130000}};

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            Random random = new Random();
            for(int i=0; i<1000; i++){
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = ranks[random.nextInt(ranks.length)];
                double salary = getSalaryByRank(rank);

                String line = firstName + " " + lastName + " " + rank + " " + salary + "\n";
                writer.write(line);
            }
            System.out.println("Đã tạo xong dữ liệu mẫu");
            int direction = -1;

            while(direction != 0){
                System.out.println("Bấm phím 1 để hiển thị thông tin toàn bộ dữ liệu vừa tạo: ");
                System.out.println("Bấm phím 2 để biết tổng lương của từng chức danh: ");
                System.out.println("Bấm phím 0 để thoát: ");
                Scanner scanner = new Scanner(System.in);
                direction = scanner.nextInt();
                if(direction == 0){
                    break;
                }
                if(direction == 1 ){
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                    String line;
                    while((line = bufferedReader.readLine()) != null){
                        System.out.println(line);
                    }
                }
                if(direction==2){
                    try {
                        // Đọc dữ liệu từ tệp Salary.txt
                        Scanner scannerfile = new Scanner(new File(fileName));

                        // Khởi tạo bản đồ để lưu tổng lương theo chức vụ
                        Map<String, Double> totalSalaryByRank = new HashMap<>();
                        totalSalaryByRank.put("assistant", 0.0);
                        totalSalaryByRank.put("teacher", 0.0);
                        totalSalaryByRank.put("associate", 0.0);

                        while (scannerfile.hasNextLine()) {
                            // Đọc từng dòng dữ liệu
                            String line = scannerfile.nextLine();
                            String[] data = line.split("\\s+"); // Phân tách bằng khoảng trắng

                            // Kiểm tra nếu dữ liệu không đủ để trích xuất
                            if (data.length >= 4) {
                                // Lấy thông tin từng trường dữ liệu
                                String firstName = data[0];
                                String lastName = data[1];
                                String rank = data[2];
                                double salary = Double.parseDouble(data[3]);

                                // Cập nhật tổng lương cho từng chức vụ
                                totalSalaryByRank.put(rank, totalSalaryByRank.get(rank) + salary);
                            } else {
                                System.out.println("Dữ liệu không hợp lệ: " + line);
                            }
                        }
                        // Đóng scanner sau khi đọc xong
                        scanner.close();

                        // Hiển thị tổng lương dành cho từng chức vụ
                        for (String rank : totalSalaryByRank.keySet()) {
                            double totalSalary = totalSalaryByRank.get(rank);
                            System.out.println("Tổng lương cho chức vụ " + rank + ": " + totalSalary);
                        }
                    } catch (FileNotFoundException e) {
                        // Xử lý nếu tệp Salary.txt không tồn tại
                        System.out.println("Têp không tồn tại");
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int getSalaryByRank(String rank){
        switch (rank) {
            case "assistant":
                return ThreadLocalRandom.current().nextInt(50000, 80000 + 1);
            case "teacher":
                return ThreadLocalRandom.current().nextInt(60000, 110000 + 1);
            case "associate":
                return ThreadLocalRandom.current().nextInt(75000, 130000 + 1);
            default:
                return -1;
        }
    }
}
