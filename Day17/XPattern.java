import java.util.Scanner;
public class XPattern {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            printPattern(n);
        }
        sc.close();
    }
}