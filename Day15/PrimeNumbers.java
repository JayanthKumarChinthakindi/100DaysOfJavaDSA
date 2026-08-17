import java.util.Scanner;
public class PrimeNumbers {
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void printPrimeNumbers(int n) {
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("There are no prime numbers in this range.");
        } else {
            printPrimeNumbers(n);
        }
        sc.close();
    }
}