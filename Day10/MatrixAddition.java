public class MatrixAddition {
    // Add two matrices
    static int[][] addMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                result[row][col] = first[row][col] + second[row][col];
            }
        }
        return result;
    }
    // Print matrix
    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] first = {
            {1, 2},
            {3, 4}
        };
        int[][] second = {
            {5, 6},
            {7, 8}
        };
        int[][] result = addMatrices(first, second);
        System.out.println("First Matrix:");
        printMatrix(first);
        System.out.println("\nSecond Matrix:");
        printMatrix(second);
        System.out.println("\nResult:");
        printMatrix(result);
    }
}