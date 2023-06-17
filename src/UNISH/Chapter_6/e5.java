package UNISH.Chapter_6;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter integers: ");
        double n = f.nextDouble();
        double b = f.nextDouble();
        double l = f.nextDouble();
        displaySortedNumbers(n, b , l);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
            double iley;
            if (num1 > num2) {
                iley = num2;
                num2 = num1;
                num1 = iley;
            } else if (num2 > num3) {
                iley = num3;
                num3 = num2;
                num2 = iley;
            }
            System.out.println(num1 + "\n" + num2 + "\n" + num3);
            return;

    }
}
