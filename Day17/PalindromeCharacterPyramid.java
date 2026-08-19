import java.util.Scanner;
public class PalindromeCharacterPyramid {
    static void printPattern(int n) {
        if (n > 26) {
            System.out.println("Maximum supported rows: 26.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Increasing characters
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);
            }
            // Decreasing characters
            for (int j = i - 1; j >= 1; j--) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);
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
        } else {
            printPattern(n);
        }
        sc.close();
    }
}