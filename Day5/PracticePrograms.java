import java.util.Scanner;
public class PracticePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Program 1
        System.out.println("1. Numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // Program 2
        System.out.println("\n\n2. Numbers from 10 to 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Program 3
        System.out.println("\n\n3. Even Numbers");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        // Program 4
        System.out.println("\n\n4. Odd Numbers");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        // Program 5
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("\n\n5. Sum = " + sum);
        // Program 6
        System.out.print("\nEnter Number for Table: ");
        int number = sc.nextInt();
        System.out.println("Multiplication Table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        // Program 7
        System.out.print("\nEnter Number: ");
        int num = sc.nextInt();
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        System.out.println("Digits = " + digits);
        // Program 8
        System.out.print("\nEnter Number to Reverse: ");
        int reverseNumber = sc.nextInt();
        int reverse = 0;
        while (reverseNumber != 0) {
            int digit = reverseNumber % 10;
            reverse = reverse * 10 + digit;
            reverseNumber /= 10;
        }
        System.out.println("Reverse = " + reverse);
        // Program 9
        System.out.print("\nEnter Number: ");
        int sumDigits = sc.nextInt();
        int digitSum = 0;
        while (sumDigits != 0) {
            digitSum += sumDigits % 10;
            sumDigits /= 10;
        }
        System.out.println("Sum of Digits = " + digitSum);
        // Program 10
        System.out.print("\nEnter Number: ");
        int palindrome = sc.nextInt();
        int original = palindrome;
        int rev = 0;
        while (palindrome != 0) {
            rev = rev * 10 + palindrome % 10;
            palindrome /= 10;
        }
        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        // Program 11
        System.out.print("\nEnter Number for Factorial: ");
        int fact = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= fact; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
        // Program 12
        System.out.print("\nEnter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Power: ");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Result = " + result);
        // Program 13
        System.out.print("\nEnter Fibonacci Terms: ");
        int terms = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        // Program 14
        System.out.println("\n\nNumbers Divisible by 3 and 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        // Program 15
        System.out.println("\n\nBreak & Continue Demo");
        for (int i = 1; i <= 10; i++) {
            if (i == 4)
                continue;
            if (i == 8)
                break;
            System.out.print(i + " ");
        }
        sc.close();
    }
}