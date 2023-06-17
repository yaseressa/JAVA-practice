package UNISH.Chapter_9;

public class Intersect {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    Intersect(double a, double b, double c, double d, double e, double f){
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
    public static String getIntersectingPoint(double x1,double y1,double x2,double y2,
                                                      double x3,double y3,double x4,double y4) {
        double a = (y1 - y2);
        double b = (-x1 + x2);
        double c = (y3 - y4);
        double d = (-x3 + x4);
        double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
        double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

        return ("( " + new Intersect(a,b,c,d,e,f).getX()+ ", " + new Intersect(a,b,c,d,e,f).getY() + " )");
    }


}
class InterMain{
    public static void main(String[] args) {

        System.out.println(Intersect.getIntersectingPoint(1,2,1,2,3,1,1,2));
    }

}
