package UNISH.Chapter_6;

public class e13 {
    public static void main(String[] args) {
        System.out.println("I                      m(i)");
        for(double i = 1; i <= 20; i++){
            System.out.println(i +"            " + (sumSeries(i)));
        }
    }
    public static double sumSeries(double i){
         double l = 0;
        for(int b = 0;b <= i;b++) {
            l += i / (i + 2);
        }
        return l;
    }
}

