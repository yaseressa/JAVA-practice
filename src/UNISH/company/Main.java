package UNISH.company;

public class Main {
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;
        for (int i = 0; i < 100; i++)
            increment(myCount, times);
        System.out.println("count is " + myCount.count);

    }
    public static void increment(Count c, int times) {
        c.count++;
        times++;
        System.out.println("times is " + times);
    }
}
class Count {
    public int count;
    public Count (int c) {
        count = c;
    }
    public Count () {
        count = 1;
    }
}
