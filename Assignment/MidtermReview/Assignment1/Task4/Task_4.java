package MidtermReview.Assignment1.Task4;

import java.util.Date;

public class Task_4 {
    public static  void main(String[] args){
        long a = 1000;
        for(int i=0; i<8;i++){
            Date date = new Date(a = a*10);
            System.out.println(date.toString());
        }
    }
}
