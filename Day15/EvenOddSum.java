import java.util.Scanner;
public class EvenOddSum {
    static int calculateEvenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    static int calculateOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Enter a positive number.");
        } else {
            int evenSum = calculateEvenSum(n);
            int oddSum = calculateOddSum(n);
            System.out.println("Even Sum: " + evenSum);
            System.out.println("Odd Sum: " + oddSum);
        }
        sc.close();
    }
}