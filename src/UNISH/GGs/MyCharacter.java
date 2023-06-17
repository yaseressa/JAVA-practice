package UNISH.GGs;

public class MyCharacter{
    public  final char MIN_VALUE = '\u0000';
    public  final char MAX_VALUE = '\uFFFF';
    private final char value;

    static final MyCharacter[] cache = new MyCharacter[128];

    static {
        for (int i = 0; i < cache.length; i++)
            MyCharacter.cache[i] = new MyCharacter((char) i);
    }


    public MyCharacter() {
        value = MIN_VALUE;
    }

    public MyCharacter(char value) {
        this.value = value;
    }

    public static MyCharacter valueOf(char c) {

        if (c <= 127) {
            return MyCharacter.cache[c];
        }
        return new MyCharacter(c);
    }

    public static MyCharacter valueOf(int i) {
        return new MyCharacter((char) i);
    }

    public char charValue() {
        return value;
    }

    public static boolean isLowerCase(char ch) {
        return ((int) ch) >= 97 && ((int) ch) <= 122;
    }

    public static boolean isDigit(char ch) {
        return ((int) ch) >= 48 && ((int) ch) <= 57;
    }

    public static boolean isUpperCase(char ch) {
        return ((int) ch) >= 65 && ((int) ch) <= 90;
    }

    public static boolean isLetter(char ch) {
        return isUpperCase(ch) || isLowerCase(ch);
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }

    public static char toLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }

    public static char toUpperCase(char ch) {
        return Character.toUpperCase(ch);
    }

    public static int compare(char x, char y) {
        return x - y;
    }


    public int compareTo(MyCharacter anotherMyCharacter) {
        return compare(this.value, anotherMyCharacter.value);
    }


    public int hashCode() {
        return MyCharacter.hashCode(value);
    }


    public static int hashCode(char value) {
        return value;

    }


    public boolean equals(MyCharacter obj) {
            return (int) this.value == (int) obj.value;
        }


    public String toString() {

        return String.valueOf(value);
    }
}

class Mycmain {
    public static void main(String[] args) {
        var myc = new MyCharacter('Z');
        var myc2 = new MyCharacter('Z');
        System.out.println("chars: "+myc.charValue());
        System.out.println("equality: "+myc.equals(myc2));
        System.out.println("Comparing: "+myc.compareTo(myc2));
        System.out.println("Hashcode: "+myc.hashCode());
        System.out.println("String: " + myc);
        System.out.println("is a digit: " + MyCharacter.isDigit('Z'));
        System.out.println("is a letter: " + MyCharacter.isLetter('Z'));
        System.out.println("is a digit or a letter: " + MyCharacter.isLetterOrDigit('Z'));
        System.out.println("is in lowercase: " + MyCharacter.isLowerCase('Z'));
        System.out.println("is in uppercase: " + MyCharacter.isUpperCase('Z'));
        System.out.println("change to lowercase: " + MyCharacter.toLowerCase('Z'));
        System.out.println("change to uppercase: " + MyCharacter.toUpperCase('Z'));
        System.out.println("as a char: " + MyCharacter.valueOf(90));
        System.out.println("in char: " + MyCharacter.valueOf('Z'));



    }
}
