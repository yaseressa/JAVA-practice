package UNISH.Chapter_6;

public class e14 {
    public static void main(String[] args) {

        System.out.println("i               m(i)");
        System.out.println("----------------------");
        double sum = 0;
        boolean addOrSubtract = false; // false -> subtract || true -> add

        for (int i = 1; i < 1000; i += 100) {
            System.out.print(i + "          ");
            System.out.printf("       %.4f\n", lseries(i));

        }


    }

    static double lseries(double num) {
        double result = 0;
        for (int i = 1; i <= num; i++) {
            result += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return result * 4;
    }
}
