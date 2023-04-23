package bai2;

public class TestMyInteger {
    public static void main(String[] args) throws Exception{
        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(8);

        // test getValue()
        System.out.println(num1.GetValue() == 7);// true

        // test isEven(), isOdd(), isPrime()
        System.out.println(!num1.isEven());
        System.out.println(num1.isOdd());
        System.out.println(num1.isPrime());
        System.out.println(num2.isEven());
        System.out.println(!num2.isOdd());
        System.out.println(!num2.isPrime());

        // test equals()
        System.out.println(num1.equals(7));
        System.out.println(!num1.equals(8)); ;
        System.out.println(num1.equals(new MyInteger(7)));
        System.out.println(!num1.equals(num2)) ;

        // test static isEven(), isOdd(), isPrime()
        System.out.println(MyInteger.isEven(6)) ;
        System.out.println(!MyInteger.isEven(7));
        System.out.println(MyInteger.isOdd(5)) ;
        System.out.println(!MyInteger.isOdd(4));
        System.out.println(MyInteger.isPrime(11));
        System.out.println(!MyInteger.isPrime(9));

        // test static parseInt()
        System.out.println(MyInteger.parseInt("123") == 123);
        System.out.println(MyInteger.parseInt(new char[] {'1', '2', '3'}) == 123);
    }
}
