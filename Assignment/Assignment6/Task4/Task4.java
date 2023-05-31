package Assignment6.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args){
        String fileName = "Salary.txt";
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                String[] data = line.split("\\s+");
                String firstName1 = data[0].trim();
                String lastName1 = data[1].trim();
                String rank1 = data[2].trim();
                Double salary1 = Double.parseDouble(data[3].trim());
                Employee employee = new Employee(firstName1, lastName1, rank1, salary1);
                employees.add(employee);

            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));

        // Hiển thị danh sách đã sắp xếp
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static class Employee{
        private String firstName;
        private String lastName;
        private String rank;
        private Double salary;

        public Employee(String firstName, String lastName, String rank, Double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.rank = rank;
            this.salary = salary;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getRank() {
            return rank;
        }

        public double getSalary() {
            return salary;
        }
        @Override
        public String toString(){
            return firstName + " " + lastName + " " + rank + " "+ salary;
        }
    }
}
