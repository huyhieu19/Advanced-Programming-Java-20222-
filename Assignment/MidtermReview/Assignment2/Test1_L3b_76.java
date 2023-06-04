package MidtermReview.Assignment2;

public class Test1_L3b_76 {
    public static void main(String[] args) {
        String[] tokens1 = "Java,C?C#,C++".split("[.,:;?]");
        for(String i : tokens1){
            System.out.println(i);
        }
    }
}
