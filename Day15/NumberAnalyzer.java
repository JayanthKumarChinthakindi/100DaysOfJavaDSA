import java.util.Scanner;
public class NumberAnalyzer {
    static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    static int sumOfDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
    static int reverseNumber(int number) {
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse * sign;
    }
    static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        return number == reverseNumber(number);
    }
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
    static int largestDigit(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 0;
        }
        int largest = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number /= 10;
        }
        return largest;
    }
    static int smallestDigit(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 0;
        }
        int smallest = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            number /= 10;
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER ANALYZER");
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("ANALYSIS");
        System.out.println("Number: " + number);
        System.out.println("Number of Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(number));
        System.out.println("Reverse: " + reverseNumber(number));
        System.out.println("Palindrome: " + (isPalindrome(number) ? "Yes" : "No"));
        System.out.println("Prime: " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Largest Digit: " + largestDigit(number));
        System.out.println("Smallest Digit: " + smallestDigit(number));
        sc.close();
    }
}