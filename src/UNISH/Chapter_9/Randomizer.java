package UNISH.Chapter_9;
import java.util.Random;
public class Randomizer {
    public static void main(String[] args) {
        var random1 = new Random(2000);
        for(int i = 1; i <= 50; i++) {
            System.out.print(random1.nextInt(100) + ", ");
        }
    }
}
