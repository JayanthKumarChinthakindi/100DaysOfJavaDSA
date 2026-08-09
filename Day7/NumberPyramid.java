public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // Spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // Numbers
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}