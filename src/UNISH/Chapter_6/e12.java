package UNISH.Chapter_6;

public class e12 {
    public static void main(String[] args) {
        printNumbers(1, 100, 10);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine) {

        int b = num2;
        for (int a = num1; a <= b; a++) {
                System.out.print(a + ", ");
                if(a % numberPerLine == 0){
                    System.out.println();
            }

        }
    }
}
