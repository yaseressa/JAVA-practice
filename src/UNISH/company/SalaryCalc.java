package UNISH.company;

public class SalaryCalc {
    public static void main (String [] args){
        int sal, hr;
        sal = 300;
        double per = 0.15;
        hr = 3;
        double wage = minisal(sal, per, hr);
        System.out.println(wage);
    }
    public static double minisal(
            int sal,
            double per,
            int hr
    ){
        return (sal * per * hr) + sal ;
    }
}
