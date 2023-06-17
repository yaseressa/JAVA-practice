package UNISH.proco;

public class TvMain {
    public static void main(String[] args) {
        var tv1 = new Tv();
        tv1.turnOn();
        tv1.channelUp(20);
        tv1.volumeUp(4);
        System.out.println(tv1);
        tv1.turnOff();
    }
}
