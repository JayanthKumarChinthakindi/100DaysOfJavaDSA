import java.util.Scanner;
public class NumberUtility {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n) {
        return n % 2 != 0;
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
    static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
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
    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
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
    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs((a / gcd(a, b)) * b);
    }
    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
    static int square(int n) {
        return n * n;
    }
    static int cube(int n) {
        return n * n * n;
    }
    static void displayMenu() {
        System.out.println();
        System.out.println("NUMBER UTILITY");
        System.out.println("1. Check Even");
        System.out.println("2. Check Odd");
        System.out.println("3. Check Prime");
        System.out.println("4. Factorial");
        System.out.println("5. Reverse Number");
        System.out.println("6. Check Palindrome");
        System.out.println("7. Sum of Digits");
        System.out.println("8. Count Digits");
        System.out.println("9. GCD");
        System.out.println("10. LCM");
        System.out.println("11. Maximum");
        System.out.println("12. Minimum");
        System.out.println("13. Square");
        System.out.println("14. Cube");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Number Utility closed.");
                break;
            }
            switch (choice) {
                case 1: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Even: " + isEven(n));
                    break;
                }
                case 2: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Odd: " + isOdd(n));

                    break;
                }
                case 3: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Prime: " + isPrime(n));
                    break;
                }
                case 4: {
                    System.out.print("Enter number (0-20): ");
                    int n = sc.nextInt();
                    if (n < 0 || n > 20) {
                        System.out.println("Enter a number between 0 and 20.");
                    } else {
                        System.out.println("Factorial: " + factorial(n));
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Reverse: " + reverseNumber(n));
                    break;
                }
                case 6: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Palindrome: " + isPalindrome(n));
                    break;
                }
                case 7: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Digit Sum: " + sumOfDigits(n));
                    break;
                }
                case 8: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Digit Count: " + countDigits(n));
                    break;
                }
                case 9: {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("GCD: " + gcd(a, b));
                    break;
                }
                case 10: {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("LCM: " + lcm(a, b));
                    break;
                }
                case 11: {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Maximum: " + max(a, b));
                    break;
                }
                case 12: {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println( "Minimum: " + min(a, b));
                    break;
                }
                case 13: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Square: " + square(n));
                    break;
                }
                case 14: {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    System.out.println("Cube: " + cube(n));
                    break;
                }
                default:
                    System.out.println("Invalid choice.");
            }
        } while (true);
        sc.close();
    }
}