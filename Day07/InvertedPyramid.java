public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // Spaces
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            // Stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}