package UNISH.Chapter_6;

public class e17 {
    public static void printMatrix(int n) {
        if (!(n < 1000)) {
            System.out.println(n + " is too large and may overload your computer....");
            return;
        }
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();

        }
    }
}