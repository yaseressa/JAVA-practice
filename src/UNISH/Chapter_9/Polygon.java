package UNISH.Chapter_9;

public class Polygon {
    private int n;
    private double side;
    private double x;
    private double y;

    Polygon() {

    }

    Polygon(int n, double side) {
        this.n = n;
        this.side = side;

    }

    Polygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    double getPerimeter(){
        return this.side * this.n;
    }
    double getArea(){
        double A = (n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI / this.n));
        return A;
    }
}
class PolyMain{
    public static void main(String[] args) {
        var poly1 = new Polygon();
        var poly2 = new Polygon(10, 4,
                5.6, 7.8);
        var poly3 = new Polygon(6, 4);
        System.out.println("Perimeter for poly1: " + poly1.getPerimeter());
        System.out.println("Area for poly1: " + poly1.getArea());
        System.out.println("Perimeter for poly2: " + poly2.getPerimeter());
        System.out.println("Area for poly2: " + poly2.getArea());
        System.out.println("Perimeter for poly3: " + poly3.getPerimeter());
        System.out.println("Area for poly3: " + poly3.getArea());
    }
}