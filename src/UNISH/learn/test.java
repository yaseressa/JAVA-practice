package UNISH.learn;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        var f = new Scanner(System.in);
        int f1 = f.nextInt();
        printPrimeNumbers(50, f1);
    }

    public static void printPrimeNumbers(int numberOfPrimes, int num) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = num; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.print( number + "\n");

                } else
                    System.out.print(number + "\n");

            }

            // Check whether the next number is prime
            number++;

        }

    }

    /* Check whether number is prime */


    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime

            }

        }

        return true;
    }
}