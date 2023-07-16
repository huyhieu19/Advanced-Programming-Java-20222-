package ReviewFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"))){
            String name = input.readUTF();
            double score = input.readDouble();
            Date date= (Date)(input.readObject());
            System.out.println(name + " " + score + " " + date);
        }
    }
}
