package UNISH.Chapter_9;
import java.util.Scanner;
public class LinearEq {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
   LinearEq(double a, double b, double c, double d, double e, double f){
       this.a = a;
       this.b = b;
       this.c = c;
       this.d = d;
       this.e = e;
       this.f = f;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    boolean isSolvable(){
        double sov = (a * d) - (b * c);
        return sov != 0;
    }
    double getX(){
        return (e * d) - (b * f) / (a * d) - (b * c);
    }
    double getY(){
        return (a * f) - (e * c) / (a * d) - (b * c);
    }

}
class LinearMain{
    public static void main(String[] args) {
        var gg = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = gg.nextDouble();
        double b = gg.nextDouble();
        double c = gg.nextDouble();
        double d = gg.nextDouble();
        double e = gg.nextDouble();
        double f = gg.nextDouble();
        var linear = new LinearEq(a, b, c, d, e, f);
        if (linear.isSolvable() == true)
            System.out.println("X= " + linear.getX() + "\n" + "Y= " + linear.getY());
        else
            System.out.println("The equation has no solution.");
    }
}
