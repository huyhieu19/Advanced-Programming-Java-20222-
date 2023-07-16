package ReviewFile;

import java.io.File;
import java.util.Date;

public class LopFile {
    public static void main(String[] args) {
        File file = new File("Salary.txt");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("Length: " + file.length());
        System.out.println("Can read: "+ file.canRead());
        System.out.println("Can written: "+file.canWrite());
        System.out.println("Is it a directory " +file.isDirectory());
        System.out.println("Is it a file " +file.isFile());
        System.out.println("Is it a absolute " +file.isAbsolute());
        System.out.println("Is it a hidden " +file.isHidden());
        System.out.println("Last modified of " + new Date(file.lastModified()));


    }
}
