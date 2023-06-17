package roar;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class BinaryCode {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter any Alphanumeric: ");
        String Bst = f.nextLine();
        Stack<String> binary = new Stack<>();
        String Rb = "";
        for (int i = 0; i < Bst.length(); i++) {
            for (int c = Bst.charAt(i); c > 0; c=c / 2) {
                if(c % 2 == 0){
                    binary.push("0");

                }else{
                    binary.push("1");

                }
            }
            binary.push("\n");
        }
        Collections.reverse(binary);

        for (int i = 0; i < binary.size(); i++) {
            System.out.print(binary.get(i));
        }

    }
}
