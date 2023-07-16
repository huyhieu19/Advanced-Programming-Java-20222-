package ReviewFile;

import java.io.IOException;
import java.io.PrintWriter;
public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
// Create a file
        PrintWriter output = new PrintWriter(file);
// Write formatted output to the file
        output.print("Nguyen Van A ");
        output.println(9);
        output.print("Nguyen Van B ");
        output.println(8);
// Close the file
        output.close();
    }
}
// File
//    Nguyen Van A9
//    Nguyen Van B8
