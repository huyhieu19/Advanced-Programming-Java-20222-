package MidtermReview.Assignment1.Task5;

import java.util.Random;

public class Task_5 {
    public static  void main(String[] args){
        Random random = new Random(1000);
        for(int i=0; i<50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }
}
