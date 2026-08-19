import java.util.Scanner;
public class PascalsTriangle {
    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            long value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else if (n > 30) {
            System.out.println(
                    "Please enter rows up to 30."
            );
        } else {
            printPattern(n);
        }
        sc.close();
    }
}