package UNISH.Chapter_6;

public class e38 {
    public static void main(String[] args) {
        for (int i = 0; i < 400; i++) {

            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            if (i <= 200) {
                System.out.print(getRandomUpperCaseLetter());
                System.out.print(" ");
            } else {
                System.out.print(getRandomDigitCharacter());
                System.out.print(" ");
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
