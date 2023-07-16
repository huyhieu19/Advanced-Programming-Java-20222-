package ReviewFile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectInputStream {
    public static void main(String[] args) throws Exception{
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"))){
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new Date());
        }
    }
}
