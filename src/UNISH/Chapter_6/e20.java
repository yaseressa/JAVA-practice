package UNISH.Chapter_6;

import java.util.Scanner;

public class e20 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = f.next();
        System.out.println(countLetters(s));
    }
    public static int countLetters(String s){
        return s.length();
    }
}
