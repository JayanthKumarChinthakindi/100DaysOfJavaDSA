import java.util.Scanner;
public class NumberMethods {
    // Check whether a number is even
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    // Check whether a number is odd
    static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    // Check whether a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Calculate factorial
    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // Reverse a number
    static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }
    // Check palindrome
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = reverseNumber(n);
        return original == reverse;
    }
    // Count digits
    static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    // Sum of digits
    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println();
        System.out.println("Number: " + number);
        System.out.println("Even: " + isEven(number));
        System.out.println("Odd: " + isOdd(number));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Reverse: " + reverseNumber(number));
        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digit Sum: " + sumOfDigits(number));
        if (number >= 0 && number <= 20) {
            System.out.println("Factorial: " + factorial(number));
        } else {
            System.out.println("Factorial: Enter a number between 0 and 20.");
        }
        sc.close();
    }
}