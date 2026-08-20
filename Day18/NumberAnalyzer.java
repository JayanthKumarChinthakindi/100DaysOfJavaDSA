import java.util.Scanner;
public class NumberAnalyzer {
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
    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    static int reverseNumber(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse * sign;
    }
    static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        return n == reverseNumber(n);
    }
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
    static int largestDigit(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        int largest = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;
        }
        return largest;
    }
    static int smallestDigit(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        int smallest = 9;
        while (n != 0) {
            int digit = n % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            n = n / 10;
        }
        return smallest;
    }
    static void analyzeNumber(int number) {
        System.out.println();
        System.out.println("NUMBER ANALYSIS");
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digit Sum: " + sumOfDigits(number));
        System.out.println("Reverse: " + reverseNumber(number));
        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Largest Digit: " + largestDigit(number));
        System.out.println("Smallest Digit: " + smallestDigit(number));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        analyzeNumber(number);
        sc.close();
    }
}