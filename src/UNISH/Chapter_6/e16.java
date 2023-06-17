package UNISH.Chapter_6;

public class e16 {
    public static void main(String[] args) {
        System.out.println("Year           Total Days");
        System.out.print("__________________________");
        for (int yr = 2014; yr <= 2034; yr++) {
            System.out.print("\n" + yr + " = " + numberOfDaysInAYear(yr));

        }
    }

    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
