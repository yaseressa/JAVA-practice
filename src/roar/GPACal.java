package roar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GPACal {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        double grader=0;
        double g;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter Your "+i+" course marks: ");
            double marks = f.nextDouble();
            if(marks != 0){
                if(marks>=95.0){
                    g = 4.0;
                    System.out.println("            A+");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=90){
                    g= 4.0;
                    System.out.println("            A");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=85){
                    g =3.67;
                    System.out.println("            A-");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=80){
                    g=3.33;
                    System.out.println("            B+");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=75){
                    g =3.0;
                    System.out.println("            B");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=70){
                    g = 2.67;
                    System.out.println("            B-");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=65){
                    g = 2.33;
                    System.out.println("            C+");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=60){
                    g = 2.00;
                    System.out.println("            C");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=55){
                    g = 1.67;
                    System.out.println("            C-");
                    System.out.println("            " + g);
                    grader += g;
                }                else if(marks>=50){
                    g = 1.00;
                    System.out.println("            D");
                    System.out.println("            " + g);
                    grader += g;
                }                else{
                    g = 0;
                    System.out.println("            Failed");
                    System.out.println("            " + g);
                    grader += g;
                }
            }

        }
        System.out.println();
        grader = grader /6;
        DecimalFormat gr = new DecimalFormat("#.##");
        grader = Double.parseDouble(gr.format(grader));
        if(grader == 4 || grader >= 3.67) {
            System.out.println(grader + "   EXCELLENT");
        }
        else if(grader >= 3.33 || grader >= 3.00) {
            System.out.println(grader + "   VERY GOOD");
        }
        else if(grader >= 2.67) {
            System.out.println(grader + "   GOOD");
        }
        else if(grader >= 2.33 || grader == 2.00) {
            System.out.println(grader + "   SATISFACTORY");
        }
        else if(grader == 1.6) {
            System.out.println(grader + "   PASS");
        }
        else if(grader == 1.0) {
            System.out.println(grader + "   POOR");
        }
        else {
            System.out.println(grader + "   FAILED");
        }
    }
}
