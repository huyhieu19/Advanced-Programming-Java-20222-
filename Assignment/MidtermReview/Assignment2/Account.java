package MidtermReview.Assignment2;

import java.time.Instant;
import java.util.Date;

public class Account {
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    Date dateCreated;
    public Account(){

    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDate(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
}
