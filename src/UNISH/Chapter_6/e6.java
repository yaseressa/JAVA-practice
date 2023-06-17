package UNISH.Chapter_6;
import java.util.Scanner;
public class e6 {
    public static void main(String[] args) {
        var f = new Scanner (System.in);
        System.out.print("Enter an integer of three: ");
        int n = f.nextInt();
        displayPattern(n);
    }
        public static void displayPattern(int n) {

            int pad = n - 1; //Track padding to loop for each line
            for (int r = 1; r <= n; r++) { //Main loop

                for (int p = 0; p < pad; p++) {
                    System.out.print("  ");
                }


                for (int i = r; i > 0; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
                pad--; // decrease padding as we increase r in for loop
            }
        }
    }

