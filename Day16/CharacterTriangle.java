import java.util.Scanner;
public class CharacterTriangle {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
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
        if (n <= 0 || n > 26) {
            System.out.println("Enter a number between 1 and 26.");
        } else {
            printPattern(n);
        }
        sc.close();
    }
}