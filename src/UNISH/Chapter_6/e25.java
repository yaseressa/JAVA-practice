package UNISH.Chapter_6;

public class e25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(5500));
    }
    public static String convertMillis(long millis){
        long seconds = millis / 1000;
        long minutes = seconds /60;
        long hours = minutes / 60;
        return hours + " : " + minutes +  " : " + seconds ;


    }
}
