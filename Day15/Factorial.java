import java.util.Scanner;
public class Factorial {
    static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n > 20) {
            System.out.println("Number is too large for long data type.");
        } else {
            System.out.println(n + "! = " + calculateFactorial(n));
        }
        sc.close();
    }
}