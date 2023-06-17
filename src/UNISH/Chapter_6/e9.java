package UNISH.Chapter_6;

public class e9 {

        public static void main(String[] args) {
            System.out.print("kilogram                    " + "pounds   |  ");                             System.out.println("pounds                  " + "kilograms   ");
            System.out.print(1 + "                         " + kilogramToPound(1) + "      |  ");          System.out.println(20 + "                          " + poundToKilogram(20) );
            System.out.print(3 + "                           " + kilogramToPound(3) + "    |  ");         System.out.println(25 + "                          " + poundToKilogram(25) );
            System.out.print(197 + "                         " + kilogramToPound(197) + "   |  ");          System.out.println(510 + "                         " + poundToKilogram(510) );
            System.out.print(199 + "                        " + kilogramToPound(199) + "    |  ");        System.out.println(515 + "                         " + poundToKilogram(515) );

        }
    public static double poundToKilogram(double pound){

        double kilogram = 2.204 * pound;
            return kilogram;
        }
    public static double kilogramToPound(double kilogram){
            double pound = 0.453 * kilogram;
            return pound;
        }
    }

