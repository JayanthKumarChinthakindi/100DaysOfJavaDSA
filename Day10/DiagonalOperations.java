public class DiagonalOperations {
    // Print main diagonal
    static void printMainDiagonal(int[][] matrix) {
        System.out.println("Main Diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
    // Print secondary diagonal
    static void printSecondaryDiagonal(int[][] matrix) {
        System.out.println("Secondary Diagonal:");
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            System.out.print(
                matrix[row][n - 1 - row] + " "
            );
        }
        System.out.println();
    }
    // Main diagonal sum
    static int mainDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    // Secondary diagonal sum
    static int secondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            sum += matrix[row][n - 1 - row];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        printMainDiagonal(matrix);
        printSecondaryDiagonal(matrix);
        System.out.println("Main Diagonal Sum: " + mainDiagonalSum(matrix));
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum(matrix));
    }
}