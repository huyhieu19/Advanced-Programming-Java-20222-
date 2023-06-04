package MidtermReview.Assignment3;

public class MyInteger {
    public int value;

    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public boolean isEven(){
        if(this.value %2 == 0){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
        if(isEven()==true){
            return false;
        }
        return true;
    }
    public boolean isPrime(){
        if(this.value < 2){
            return false;
        }
        for(int i=2; i<Math.sqrt(this.value); i++){
            if(this.value % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEvent(int number){
        if(number %2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isOdd(int number){
        if(number %2 != 0){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i=2; i<Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEvent(MyInteger integer){
        if(integer.value %2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isOdd(MyInteger integer){
        if(integer.value %2 != 0){
            return true;
        }
        return false;
    }
    public static boolean isPrime(MyInteger integer){
        if(integer.value < 2){
            return false;
        }
        for(int i=2; i<Math.sqrt(integer.value); i++){
            if(integer.value % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean equals(int value){
        if(this.value == value){
            return true;
        }
        return false;
    }
    public boolean equals(MyInteger integer){
        if(integer.value == this.value){
            return true;
        }
        return false;
    }
    //Phương thức tĩnh parseInt (char []) chuyển đổi một mảng các ký tự số thành giá trị int.
    public static int parseInt(char[] charInt) throws Exception{
        var result = 1;
        for(var i : charInt){
            if (!Character.isDigit(i)) {
                throw new NumberFormatException("Invalid character: " + i);
            }
            result = result * 10 + Character.digit(i, 10);
        }
        return result;
    }
    public static int parseInt(String str) throws Exception{
        return parseInt(str.toCharArray());
    }

}
