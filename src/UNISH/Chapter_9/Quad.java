package UNISH.Chapter_9;
import java.util.Scanner;
public class Quad {
    private final double a;
    private final double b;
    private final double c;
    Quad(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    double getDiscriment(){
        return Math.pow(b, 2) - (4 * a * c);
    }
    double getRoot1(){
        if (this.getDiscriment() > 0)
            return (-b + Math.sqrt(getDiscriment())) / (2 * a);
        else
            return 0;
    }
    double getRoot2(){
        if (this.getDiscriment() > 0)
            return (-b - Math.sqrt(getDiscriment())) / (2 * a);
        else
            return 0;
    }
}
class QuadMain{
    public static void main(String[] args) {
        var f = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = f.nextDouble();
        System.out.print("Enter b: ");
        double b = f.nextDouble();
        System.out.print("Enter c: ");
        double c = f.nextDouble();
        var q1 = new Quad(a, b, c);
        if(q1.getDiscriment() == 0)
            System.out.println(q1.getRoot1());
        else if(q1.getDiscriment() > 0)
            System.out.println(
                    "r1= " + q1.getRoot1() + "\n" + "r2= " + q1.getRoot2()
            );
        else
            System.out.println("The equation has no roots");
    }
}
