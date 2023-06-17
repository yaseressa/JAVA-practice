package UNISH.Chapter_6;

public class e8 {
    public static void main(String[] args) {
        System.out.println("mile                    " + "kilometer   |  ");
        for(int i = 1; i <= 20; i++) {
            System.out.println(i + "___________________0____" + mileToKilometer(i) );
        }
        System.out.println("\n\n\nkilometer                  " + "mile   ");
System.out.println(20 + "                         " + kilometerToMile(20) );
System.out.println(25 + "                         " + kilometerToMile(25) );
System.out.println(60 + "                         " + kilometerToMile(60) );
System.out.println(65 + "                         " + kilometerToMile(65) );

    }
    public static double mileToKilometer(double mile){
        double kilometer = mile * 1.6 ;
        return kilometer;
    }
    public static double kilometerToMile(double kilometer){
        double mile =  kilometer / 1.6;
        return mile;
    }
}
