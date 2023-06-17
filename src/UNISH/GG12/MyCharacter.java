package UNISH.GG12;

public class MyCharacter {
    public static final char MIN_VALUE = '\u0000';
    public static final char MAX_VALUE = '\uFFFF';
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
        return ((int) ch) > 96 && ((int) ch) < 123;
    }

    public static boolean isDigit(char ch) {
        return ((int) ch) >= 48 && ((int) ch) <= 57;
    }

    public static boolean isUpperCase(char ch) {
        return ((int) ch) >= 65 && ((int) ch) <= 90;
    }

    public static boolean isLetter(char ch) {
        return ((int) ch) >= 65 && ((int) ch) <= 122;
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

    @Override
    public int hashCode() {
        return MyCharacter.hashCode(value);
    }


    public static int hashCode(char value) {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyCharacter) {
            return value == ((MyCharacter) obj).charValue();
        }
        return false;
    }

    @Override
    public String toString() {
        char[] buf = {value};
        return String.valueOf(buf);
    }
}
class mymain{
    static MyCharacter[] myCharacters = new MyCharacter[10];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            myCharacters[i] = MyCharacter.valueOf(((int) (1 + Math.random() * 123)));
        }
        System.out.println("MyCharacter.valueOf(myCharacters[0].charValue()): " + MyCharacter.valueOf(myCharacters[0].charValue()));
        System.out.println("MyCharacter.valueOf(myCharacters[4].charValue()): " + MyCharacter.valueOf(myCharacters[4].charValue()));
        System.out.println("myCharacters[1] = " + myCharacters[1].charValue() + " , myCharacters[7] = " + myCharacters[7].charValue() + " | " +
                "myCharacters[1].compareTo" +
                "(myCharacters[7]) " +
                ":" +
                " " + myCharacters[1].compareTo(myCharacters[7]));
        System.out.println(myCharacters[5].equals(myCharacters[7]));
        System.out.println("myCharacters[6].charValue() = " + myCharacters[6].charValue() + " | MyCharacter.isDigit" +
                "(myCharacters[6].charValue()): " +
                ")" +
                ":  " + MyCharacter.isDigit(myCharacters[6].charValue()));
        System.out.println(MyCharacter.isLetter(myCharacters[5].charValue()));
        System.out.println("myCharacters[9] = " + myCharacters[9].charValue() + " | (MyCharacter.isLowerCase" +
                ", (myCharacters[9].charValue()) :" + MyCharacter.isLowerCase(myCharacters[9].charValue()));
        System.out.println("myCharacters[3] = " + myCharacters[3].charValue() + " | MyCharacter.isUpperCase" +
                "(myCharacters[3]" +
                ".charValue()" +
                ")): " + MyCharacter.isUpperCase(myCharacters[3].charValue()));
        System.out.println("myCharacters[3] = " + myCharacters[3].charValue() + ", myCharacters[4] = " + myCharacters[4].charValue()
                + " | myCharacters[3].compareTo(myCharacters[4])): " + myCharacters[3].compareTo(myCharacters[4]));
        System.out.println("myCharacters[2] = " + myCharacters[2].charValue() + " , myCharacters[8] = " + myCharacters[8].charValue() + " | myCharacters[2].compareTo(myCharacters[8])): "
                + myCharacters[2].compareTo(myCharacters[8]));

    }
}
