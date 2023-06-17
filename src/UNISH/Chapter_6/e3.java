package UNISH.Chapter_6;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter a Palindrome integer: ");
        int n = f.nextInt();
        System.out.print(isPalindrome(n));
    }
    public static int reverse(int n) {
        long fn = n % 10;
        long r = n / 10;
        long mn = r % 10;
        r = r / 10;
        long ln = r % 10;

        return Integer.parseInt((int) fn + "" + mn + "" + ln);


    }
    public static boolean isPalindrome(int n){
        long fn = n % 10;
        long r = n / 10;
        long mn = r % 10;
        r = r / 10;
        long ln = r % 10;

        long un = Integer.parseInt((int) fn + "" + mn + "" + ln);
        return n == un;

    }
}
