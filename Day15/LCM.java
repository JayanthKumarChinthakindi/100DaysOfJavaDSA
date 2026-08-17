import java.util.Scanner;
public class LCM {
    static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    static long findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int gcd = findGCD(a, b);
        return Math.abs(
                (long) a / gcd * b
        );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.println("LCM = " + findLCM(first, second));
        sc.close();
    }
}