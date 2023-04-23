package BaiTrenLop;

public class TestCircle {
    public static void main(String[] args){
        Circle testCircle = new Circle(10, "red", false);
        System.out.println("Start run set radius");
        try{
            testCircle.setRadius(-1);
        }
        catch(Exception ex)
        {
            System.out.println("xay ra ngoai le" + ex);
        }
        System.out.println("\u001B[31mEnd run set radius\u001B[0m");
    }
}