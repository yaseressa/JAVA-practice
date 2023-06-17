package UNISH.Chapter_9;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private final Date dateCreated = new Date();

    Account() {

    }

    Account(int id, double balance) {
        this.balance = balance;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = (annualInterestRate/100);
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return ((annualInterestRate) / 12);
    }

    double getMonthlyInterest() {
        return this.getMonthlyInterestRate() * balance;
    }

    void deposit(double Extras) {
        this.balance = this.balance + Extras;
    }

    void withdraw(double Takes) {
        this.balance = this.balance - Takes;
    }
}
class accMain {
    public static void main(String[] args) {
        var ob1 = new Account(1102, 20000);
        ob1.setAnnualInterestRate(4.5);
        ob1.withdraw(2500);
        ob1.deposit(3000);
        System.out.println("Balance: " + ob1.getBalance());
        System.out.println("Monthly Interest: " + ob1.getMonthlyInterest());
        System.out.println("date: " + ob1.getDateCreated());
    }

}