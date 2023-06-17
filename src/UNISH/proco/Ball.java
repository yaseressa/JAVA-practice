package UNISH.proco;

public class Ball{
    double x;
    double y;
    double distTraveledX;
    double distTraveledY;
    static double totDistXAllBalls;
    static double totDistYAllBalls;
    static double lastX;
    static double lastY;

    Ball() {
        this.x = 0;
        this.y = 0;
    }

    Ball(double newX, double newY) {
        this.x = newX;
        this.y = newY;
        lastX = x;
        lastY = y;
    }

    public static double getTotDistXAllBalls() {
        return totDistXAllBalls;
    }

    public static double getTotDistYAllBalls() {
        return totDistYAllBalls;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
        totDistXAllBalls += xDisp;
        totDistYAllBalls += yDisp;
        lastX = x;
        lastY = y;
    }

    public double getDistTraveledX() {
        return distTraveledX;
    }

    public double getDistTraveledY() {
        return distTraveledY;
    }
    public String toString(){
      return
              "Last Y Position: " + lastY +"\n"+
              "Last X Position: " + lastX +"\n"+
              "Total Distance Travelled by the Ball: (" + getTotDistXAllBalls() + ", " + getTotDistYAllBalls() + ").";
    }

}