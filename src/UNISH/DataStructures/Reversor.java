package UNISH.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Reversor {
    public static boolean isPalindrome(String s){
        char[] ca = s.toCharArray();
        char[] array = new char[s.length()];
        char[] cac = new char[s.length()];
        String f = "";
        Stack<Character> n = new Stack<>();
        for(int i = 0; i < ca.length;i++){
            if(Character.isLetterOrDigit(ca[i])) {
                n.push(ca[i]);
                cac[i] = n.pop();
                f += cac[i];

                if (cac[i] != ca[i]) {
                    return false;
                }
            }
        }
        System.out.println(f);
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number to Check: ");
        System.out.println(isPalindrome(new Scanner(System.in).next()));
    }
}
