package UNISH.Chapter_9;
import java.util.GregorianCalendar;
public class Greg {
    public static void main(String[] args) {
        var greg = new GregorianCalendar();
        System.out.println(
                "year: " + greg.get(GregorianCalendar.YEAR) + "\n" +
                        "month: " + greg.get(GregorianCalendar.MONTH) + "\n" +
                        "day: " + greg.get(GregorianCalendar.DAY_OF_MONTH));
        greg.setTimeInMillis(1234567898765L);
        System.out.println(
                "year: " + greg.get(GregorianCalendar.YEAR) + "\n" +
                        "month: " + greg.get(GregorianCalendar.MONTH) + "\n" +
                        "day: " + greg.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
