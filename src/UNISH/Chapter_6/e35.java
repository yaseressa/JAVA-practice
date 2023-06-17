package UNISH.Chapter_6;
import java.util.*;
public class e35 {
    public static void main(String[] args) {
    var f = new Scanner(System.in);
        System.out.print("Enter the side: ");
    double s = f.nextDouble();
        System.out.println(area(s));
    }
    public static double area(double side){
        double area = (5 * Math.pow(side, 2))  / (4 * Math.tan(Math.PI / 5));
        return area;
    }
}
