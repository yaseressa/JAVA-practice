package UNISH.company;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double x1, y1, x2, y2, distance;
        System.out.print("Enter x1 and y1: ");
        x1 = a.nextDouble();
        y1 = a.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = a.nextDouble();
        y2 = a.nextDouble();
        distance = Math.sqrt((Math.pow((x2 -x1), 2)) + (Math.pow((y2 -y1), 2)));
        System.out.print("the distance between the two points is " + distance);
        a.close();
    }
}
