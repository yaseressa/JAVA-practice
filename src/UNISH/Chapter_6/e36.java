package UNISH.Chapter_6;

import java.util.Scanner;

public class e36 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter the # of sides: ");
        int ns = f.nextInt();
        System.out.print("Enter the side: ");
        double sl = f.nextDouble();
        System.out.println(area(ns, sl));
    }
    public static double area(int n, double side){
        double area = (n * Math.pow(side, 2))  / (4 * Math.tan(Math.PI / n));
        return area;
    }
}
