package bai2;

import java.io.EOFException;

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
        return integer.GetValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger integer) {
        return integer.GetValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger integer) {
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
        return (integer.GetValue() == this.integer);
    }

    public static int parseInt(char[] charArray) throws Exception{

        String str = new String(charArray);
        return MyInteger.parseInt(str);

    }

    public static int parseInt(String str) throws Exception{
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            throw new Exception("Can't convert to int");
        }
    }
}
