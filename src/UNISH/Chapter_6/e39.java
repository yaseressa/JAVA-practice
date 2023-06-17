package UNISH.Chapter_6;
import java.util.Scanner;
public class e39 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = f.nextDouble();
        double y0 = f.nextDouble();
        double x1 = f.nextDouble();
        double y1 = f.nextDouble();
        double x2 = f.nextDouble();
        double y2 = f.nextDouble();
        System.out.println("left: " + leftOfTheLine(x0,y0, x1, y1, x2, y2) + "\n" +
                "on: " + onTheSameLine(x0,y0, x1, y1, x2, y2) + "\n" +
                "right: " + onTheLineSegment(x0,y0, x1, y1, x2, y2) );
    }
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double d =(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return d > 0;
    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double d =(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return d == 0;
    }
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        double d =(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return d == 0 && (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1);
    }
}
