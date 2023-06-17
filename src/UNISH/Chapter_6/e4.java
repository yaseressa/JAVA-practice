package UNISH.Chapter_6;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter an integer to be Reversed: ");
        int n = f.nextInt();
        System.out.print(reverse(n));
    }
    public static int reverse(int n) {
        long fn = n % 10;
        long r = n / 10;
        long mn = r % 10;
        r = r / 10;
        long ln = r % 10;
        r = r / 10;
        long lln = r % 10;

        return Integer.parseInt((int) fn + "" + mn + "" + ln + "" + lln);


    }
}
