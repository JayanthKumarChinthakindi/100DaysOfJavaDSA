import java.util.Scanner;
public class SumOfDigits {
    static int sumOfDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(number));
        sc.close();
    }
}