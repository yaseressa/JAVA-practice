package UNISH.company;

public class Circle {
    double Radius = 0;
    Circle(double radius){
        Radius = radius;
    }
    double getArea(){
        return Math.PI * Math.pow(Radius, 2);
    }
    double getPerimeter(){
        return 2 * Math.PI * Radius;
    }
    void setRadius(double newradius){
    Radius = newradius;
    return;
    }
}