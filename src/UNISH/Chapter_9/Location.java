package UNISH.Chapter_9;
import java.util.*;
class Locmain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");

        int numR = in.nextInt();
        int numC = in.nextInt();
        double[][] nums = new double[numR][numC];

        System.out.println("Enter the array: ");

        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                nums[r][c] = in.nextDouble();
            }
        }
        Location location = Location.locateLargest(nums);

        System.out.println("The location of the largest member is: " +location.maxValue + " at " +"("+ location.row + ", "
               + location.column + ")");



    }

}
public class Location {

    public double maxValue = Integer.MIN_VALUE;
    public int row;
    public int column;


    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }

            }
        }
        return location;
    }
}

