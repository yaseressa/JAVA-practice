package UNISH.Chapter_6;
import java.util.*;
public class e37 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number= f.nextInt();
        System.out.print("Enter the Width: ");
        int width= f.nextInt();
        System.out.println(format(number, width));
    }
    public static String format(int number, int width) {

        String re = "" + number;

        if (re.length() < width) {
            for (int i = width - re.length(); i > 0; i--) {
                re= 0 + re;
            }
        }

        return re;
    }

}
