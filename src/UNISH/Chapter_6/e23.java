package UNISH.Chapter_6;
import java.util.Scanner;
public class e23 {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.println("Enter the String and the Charecter: ");
        String word = f.nextLine();
        char charec = word.charAt(word.length() - 1);
        word = word.substring(0, word.length() - 1);
        word = word.trim();
        System.out.println(count(word, charec));
    }
    public static int count(String str, char a){
        int re = 0;
        for(int i = 0;i < str.length(); i++){
            if((str.charAt(i)) == a){
                re++;
            }

        }
        return re;
    }
}
