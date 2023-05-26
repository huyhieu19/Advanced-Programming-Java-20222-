package Assignment6.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main (String[] args){
        ArrayList<Integer> importList = new ArrayList<Integer>();

        for(int i=0; i<5000000; i++){
            importList.add(i);
        }
        long time1 = System.currentTimeMillis();
        for(int i=0; i<importList.size(); i++){
            Integer number = importList.get(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Thời gian thực thi khi duyệt qua danh sách bằng hàm get: "+ (time2 - time1) + "ms");
        long startTimeIterator  = System.currentTimeMillis();
        Iterator<Integer> integerIterator = importList.iterator();
        while(integerIterator.hasNext()){
            Integer number = integerIterator.next();
        }
        long endTimeIterator = System.currentTimeMillis();
        System.out.println("Thời gian thực thi khi duyệt qua danh sách bằng khj chuyển sang integer: "+ (endTimeIterator - startTimeIterator) + "ms");

    }
}
