 package UNISH.company;
import java.util.Random;
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private double loanAmmount;
    private int numberOfYears;
    private String name;
    Date loanDate = new Date();
    Loan(){

    }
    Loan(String name, double annualInterestRate , int numberOfYears, double loanAmmount){
        this.name = name;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmmount = loanAmmount;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getLoanAmmount() {
        return loanAmmount;
    }

    public void setLoanAmmount(double loanAmmount) {
        this.loanAmmount = loanAmmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    double getMonthlyPayment(){
        return (((this.numberOfYears * this.annualInterestRate) + this.loanAmmount) / 12);
    }
    double getTotalPayment(){
        return (this.getMonthlyPayment() * 12);
    }

    public String getName() {
        return name;
    }
}

class LoanMain{
    public static void main(String[] args) {
       /* var f = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = f.nextLine();
        System.out.print("Enter the Annual Interest Rate: ");
        double rate = f.nextDouble();
        System.out.print("Enter the no. of Years: ");
        int years = f.nextInt();
        System.out.print("Enter the Money Amount: ");
        double amount= f.nextDouble();
        var l1 = new Loan(name, rate, years, amount);
        System.out.println("Monthly payment: " + l1.getMonthlyPayment());
        System.out.println("Total Amount: " + l1.getTotalPayment());
*/
        var rand1 = new Random(0);
        int b = rand1.nextInt(200);
        System.out.println(b);
    }
}