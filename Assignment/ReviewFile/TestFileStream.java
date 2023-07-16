package ReviewFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileStream {
    public static void main(String[] args) throws Exception{
        try(
                FileOutputStream outputStream = new FileOutputStream("temp.dat");

        ){
            for(int i=0; i<=10; i++){
                outputStream.write(i);
            }
        }
        try(FileInputStream input = new FileInputStream("temp.dat")){
            int value;
            while((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}
