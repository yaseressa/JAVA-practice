package UNISH.Chapter_6;
import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {
     var f = new Scanner (System.in);
        System.out.print("Enter an integer of three: ");
     long n = f.nextLong();
        System.out.print(sumDigits(n));
    }

    public static int sumDigits(long n) {
        long fn = n % 10;
        long r = n / 10;
        long mn = r % 10;
        r = r / 10;
        long ln = r % 10;
        return (int) (fn + mn + ln);


    }
}