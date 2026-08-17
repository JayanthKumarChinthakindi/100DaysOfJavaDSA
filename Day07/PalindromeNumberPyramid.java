public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // Increasing numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // Decreasing numbers
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}