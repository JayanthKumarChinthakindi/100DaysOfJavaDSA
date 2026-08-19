import java.util.Scanner;
public class ReverseNumberPyramid {
    static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            // Spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
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