import java.util.Scanner;
public class CharacterPyramid {
    static void printPattern(int n) {
        if (n > 13) {
            System.out.println("Please enter rows between 1 and 13.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Characters
            for (int j = 1; j <= 2 * i - 1; j++) {
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