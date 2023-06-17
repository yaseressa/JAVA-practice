package UNISH.Chapter_9;

public class FanMain {
    public static void main(String[] args) {
        var fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1);
        var fan2 = new Fan();
        fan2.setColor("blue");
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2);
    }

}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    Fan(){}
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String isOn() {

        return on == true?"ON":"OFF";
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        if(on == true) {
            return "Fan is " + this.isOn() + "\n" +
                    "Fan Speed is " + this.getSpeed() + "\n" +
                    "Fan Color is " + this.getColor() + "\n" +
                    "fan's Radius " + this.getRadius();
        }
        return "";
    }

    public void setColor(String color) {
        this.color = color;
    }
}