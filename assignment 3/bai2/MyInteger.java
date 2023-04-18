package bai2;

/*
 * -----------------------------------------
|            MyInteger                    |
-----------------------------------------
| - integer: int                          |
-----------------------------------------
| + MyInteger(integer: int)                |
| + getValue(): int                        |
| + isEven(): boolean                      |
| + isOdd(): boolean                       |
| + isPrime(): boolean                     |
| + isEven(myInteger: MyInteger): boolean  |
| + isOdd(myInteger: MyInteger): boolean   |
| + isPrime(myInteger: MyInteger): boolean |
| + isEven(number: Integer): boolean       |
| + isOdd(number: Integer): boolean        |
| + isPrime(number: Integer): boolean      |
| + equals(number: int): boolean           |
| + equals(myInteger: MyInteger): boolean  |
| + parseInt(chars: char[]): int           |
| + parseInt(str: String): int             |
-----------------------------------------
 */

public class MyInteger {
    private int integer;

    public MyInteger(int integer){
        this.integer = integer;
    }

    public int GetValue(){
        return integer;
    }

    public boolean isEven(){
        return (integer % 2 == 0);
    }

    public boolean isOdd(){
        return (integer % 2 != 0);
    }

    public boolean isPrime(){
        if (integer <= 1) {
            return false;
        }
    
        for (int i = 2; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(MyInteger integer) {
        return integer != null && integer.GetValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger integer) {
        return integer != null && integer.GetValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger integer) {
        if(integer == null){
            return false;
        }
        if (integer.GetValue() <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(integer.GetValue()); i++) {
            if (integer.GetValue() % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int number){
        return (number == integer);
    }

    public boolean equals(MyInteger integer){
        return (integer != null && integer.GetValue() == this.integer);
    }

    public static int parseInt(char[] charArray) throws Exception{

        int result = 0;
        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                throw new NumberFormatException("Invalid character: " + c);
            }
            result = result * 10 + Character.digit(c, 10);
        }
        return result;

    }

    public static int parseInt(String str) throws Exception{
        return parseInt(str.toCharArray());
    }
}
