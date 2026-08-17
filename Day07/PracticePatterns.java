public class PracticePatterns {
    public static void main(String[] args) {
        int n = 5;
        // Pattern 1 - Right Aligned Triangle
        System.out.println("Pattern 1:");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Pattern 2 - Pyramid
        System.out.println("\nPattern 2:");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Pattern 3 - Inverted Pyramid
        System.out.println("\nPattern 3:");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Pattern 4 - Hollow Square
       System.out.println("\nPattern 4:");
       for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n ||
                    col == 1 || col == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Pattern 5 - Number Pyramid
        System.out.println("\nPattern 5:");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        // Pattern 6 - Palindrome Number Pyramid
        System.out.println("\nPattern 6:");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}