package UNISH.Chapter_9;

import java.util.Date;
public class Dater {
    public static void main(String[] args) {
        var date = new Date();
        date.setTime(10000);
        System.out.println(date);
        date.setTime(100000);
        System.out.println(date);
        date.setTime(1000000);
        System.out.println(date);
        date.setTime(10000000);
        System.out.println(date);
        date.setTime(100000000);
        System.out.println(date);
        date.setTime(1000000000);
        System.out.println(date);
    }
}