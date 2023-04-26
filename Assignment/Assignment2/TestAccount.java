package Assignment2;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1012, 20000000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(1500000);
        account.deposit(3000000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());
    }
}
