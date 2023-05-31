package Assignment6.Task3;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args){
        String fileName = "D:\\Semester 20222\\1. Advanced Programming\\3. Projects\\Advanced Programming Assignments\\Assignment\\Assignment6\\Task3";
        File file = new File(fileName);
        if(file.isDirectory()){
            System.out.println("La thu muc");
        }
        try {
            Queue<File> queue = new LinkedList<>();
            queue.offer(file);
            long totalSize = 0;
            while(!queue.isEmpty()){
                File current = queue.poll();
                if(current.isFile()){
                    totalSize += current.length();
                } else if(current.isDirectory()){
                    File[] files = current.listFiles();
                    if(files != null){
                        for(File file1 : files){
                            queue.offer(file1);
                        }
                    }
                }
            }
            System.out.println("Size: "+ totalSize);
        } catch (Exception e) {
            System.out.println("Xảy ra lỗi");
        }

    }
}
