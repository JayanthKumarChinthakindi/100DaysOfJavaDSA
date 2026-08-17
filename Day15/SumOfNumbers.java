import java.util.Scanner;
public class SumOfNumbers {
    static int sumUsingForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    static int sumUsingWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
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
            System.out.println("Sum using for loop: " + sumUsingForLoop(n));
            System.out.println("Sum using while loop: " + sumUsingWhileLoop(n));
        }
        sc.close();
    }
}