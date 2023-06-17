package UNISH.Chapter_6;


public class e10 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 1000){
            if(isPrime(i) == true){
                System.out.print(i +", ");

        }
            i++;
    }
    }

    public static boolean isPrime(int number) {

        for (int check = 2; check <= number / 2; check++) {
            if (number % check == 0) {
                return false;
            }
        }
        return true;
    }
    }

