package UNISH.press;
import java.util.*;
public class Student {
    public static void main(String[] args) {
        var j = new Scanner(System.in);
        int best = 100;
        System.out.print("Enter Number of Students: ");
        int b = j.nextInt();
        Double[] st = new Double[b];
        System.out.print("Enter the Scores: ");
        for (int i = 0; i < b; i++){

            st[i] = j.nextDouble();

        }
        for (int i = 0; i < b; i++) {
            if (st[i] >= best - 10) {
                System.out.println("Student " + i + " Score is " + st[i] + " and Grade is A");
            }else if (st[i] >= best - 20) {
                System.out.println("Student " + i + " Score is " + st[i] + " and Grade is B");
            }else if (st[i] >= best - 30) {
                System.out.println("Student " + i + " Score is " + st[i] + " and Grade is C");
            }else if (st[i] >= best - 40){
                    System.out.println("Student " + i + " Score is " + st[i] + " and Grade is D");
            }else{
                System.out.println("Student " + i + " Failed");
            }
        }
    }
}