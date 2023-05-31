package Assignment6.Task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4_1 {
    public static void main(String[] args) throws IOException {

        // Read the stream 'demo.txt'
        // containing text "GEEKSFORGEEKS"
        FileReader fileReader
                = new FileReader(
                "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment6\\Task3\\test3.txt");

        // Convert fileReader to
        // bufferedReader
        BufferedReader buffReader
                = new BufferedReader(
                fileReader);

        while (buffReader.ready()) {
            // Read and print characters one by one
            // by converting into character
            System.out.println("Char :"
                    + (char)buffReader.read());
        }
    }
}
