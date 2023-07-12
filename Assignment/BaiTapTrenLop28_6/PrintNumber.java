package BaiTapTrenLop28_6;

public class PrintNumber implements Runnable{
    private int lastNum;
    public void PrintNum(int n){
        lastNum = n;
    }
    @Override
    public void run() {
        for (int i=0; i<= lastNum; i++) {
            System.out.println(" " + i);
        }
    }
}
