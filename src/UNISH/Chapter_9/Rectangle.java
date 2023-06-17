package UNISH.Chapter_9;


public class Rectangle {
    double width, height;
    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return (this.height * this.width);
    }
    public double getPerimeter(){
        return (2 * (this.height + this.width));
    }
}
class recMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("r1 width: " + r1.width);
        System.out.println("r1 height: " + r1.height);
        System.out.println("r1 area:" + r1.getArea());
        System.out.println("r1 perimeter:" + r1.getPerimeter());
        System.out.println("r2 width: " + r2.width);
        System.out.println("r2 height: " + r2.height);
        System.out.println("r2 area:" + r2.getArea());
        System.out.println("r2 perimeter:" + r2.getPerimeter());

    }

}