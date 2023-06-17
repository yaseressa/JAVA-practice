package UNISH.Chapter_6;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        int firstYr = 1;
        int lastYr = 30;
        Scanner f = new Scanner(System.in);

        System.out.print("Enter the invested amount: ");
        double amount = f.nextDouble();

        System.out.print("The Annual interest rate: ");
        double yrate = f.nextDouble();
        yrate = yrate / 100;

        double monthRate = yrate / 12;

        System.out.println(" ");

        for (int i = firstYr; i <= lastYr; i++) {
            System.out.print(i + ". ");
            System.out.print(futureInvestmentValue(amount, monthRate, i));
            System.out.println();
        }

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
