import java.util.Scanner;
public class PracticePrograms {
    // 1. Greet
    static void greet() {
        System.out.println("Welcome to #100DaysOfJavaDSA!");
    }
    // 2. Add two numbers
    static int add(int a, int b) {
        return a + b;
    }
    // 3. Square
    static int square(int number) {
        return number * number;
    }
    // 4. Check even
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // 5. Find maximum of two numbers
    static int findMax(int a, int b) {
        return a > b ? a : b;
    }
    // 6. Find maximum of three numbers
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    // 7. Factorial
    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // 8. Reverse a number
    static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    // 9. Check palindrome
    static boolean isPalindrome(int number) {
        int original = number;
        int reverse = reverse(number);
        return original == reverse;
    }
    // 10. Check prime
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Greeting
        System.out.println("1. Greeting");
        greet();
        // 2. Addition
        System.out.println("\n2. Addition");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + add(a, b));
        // 3. Square
        System.out.println("\n3. Square");
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Square = " + square(number));
        // 4. Even/Odd
        System.out.println("\n4. Even/Odd");
        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        // 5. Maximum of two
        System.out.println("\n5. Maximum of Two Numbers");
        System.out.println("Maximum = " + findMax(a, b));
        // 6. Maximum of three
        System.out.println("\n6. Maximum of Three Numbers");
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Maximum = " + findMax(a, b, c));
        // 7. Factorial
        System.out.println("\n7. Factorial");
        System.out.print("Enter number: ");
        int factorialNumber = sc.nextInt();
        System.out.println(
                "Factorial = " + factorial(factorialNumber)
        );
        // 8. Reverse
        System.out.println("\n8. Reverse Number");
        System.out.print("Enter number: ");
        int reverseNumber = sc.nextInt();
        System.out.println(
                "Reverse = " + reverse(reverseNumber)
        );
        // 9. Palindrome
        System.out.println("\n9. Palindrome");
        System.out.print("Enter number: ");
        int palindromeNumber = sc.nextInt();
        if (isPalindrome(palindromeNumber)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        // 10. Prime
        System.out.println("\n10. Prime Number");
        System.out.print("Enter number: ");
        int primeNumber = sc.nextInt();
        if (isPrime(primeNumber)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}