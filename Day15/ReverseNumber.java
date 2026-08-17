import java.util.Scanner;
public class ReverseNumber {
    static int reverseNumber(int number) {
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse * sign;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Reversed number: " + reverseNumber(number));
        sc.close();
    }
}