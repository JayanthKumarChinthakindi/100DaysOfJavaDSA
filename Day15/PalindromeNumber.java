import java.util.Scanner;
public class PalindromeNumber {
    static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }
    static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int original = number;
        int reverse = reverseNumber(number);
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        sc.close();
    }
}