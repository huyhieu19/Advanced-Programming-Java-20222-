package BaiTrenLop_5_24;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>(5000000);
        long start = System.currentTimeMillis();
        for(int i=0; i<5000000; i++){
            arrayList.add(i);
        }
        long a = System.currentTimeMillis();
        System.out.println("Thoi gian chay : "+ (a-start));
        ListIterator listIterator = arrayList.listIterator();
        while(listIterator.hasNext()){
            listIterator.next();
        }
        long b = System.currentTimeMillis();
        System.out.println("Thoi gian chay : "+ (b-a));
    }
}
