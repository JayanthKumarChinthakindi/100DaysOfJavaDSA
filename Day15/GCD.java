import java.util.Scanner;
public class GCD {
    static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int gcd = 1;
        int limit = Math.min(a, b);
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        if (first == 0 && second == 0) {
            System.out.println("GCD of 0 and 0 is undefined.");
        } else {
            System.out.println("GCD = " + findGCD(first, second));
        }
        sc.close();
    }
}