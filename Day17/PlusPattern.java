import java.util.Scanner;
public class PlusPattern {
    static void printPattern(int n) {
        int middle = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == middle || j == middle) {
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
        System.out.print("Enter odd size: ");
        int n = sc.nextInt();
        if (n <= 0 || n % 2 == 0) {
            System.out.println("Please enter a positive odd number.");
        } else {
            printPattern(n);
        }
        sc.close();
    }
}