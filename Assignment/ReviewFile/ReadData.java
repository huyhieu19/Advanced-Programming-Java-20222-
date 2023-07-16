package ReviewFile;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            System.out.println(
                    input.next() + " " +input.next() + " "+ input.next() + " "+ input.nextInt() + "\n"
                    + input.next() + " " +input.next() + " "+ input.next() + " "+ input.nextInt()
            );
        }
        input.close();
    }
}
