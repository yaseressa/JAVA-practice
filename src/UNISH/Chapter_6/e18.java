package UNISH.Chapter_6;

import java.util.Scanner;

public class e18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the password to check: ");
        String pwd = in.next();
        System.out.print(validatePassword(pwd) ? "Valid Password" : "Invalid Password");

        in.close();
    }

    static boolean validatePassword(String pword) {
        int countDigits = 0;
        if (pword.length() < 10) {
            return false;
        }
        for (int i = 0; i < pword.length(); i++) {
            char c = pword.charAt(i);
            if (Character.isDigit(c)) {
                countDigits++;
            } else if (!Character.isLetter(c)) {
                return false;
            }
        }
        return countDigits >= 3;
    }
}
