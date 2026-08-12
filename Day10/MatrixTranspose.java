public class MatrixTranspose {
    // Create transpose
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                result[col][row] = matrix[row][col];
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
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        int[][] result = transpose(matrix);
        System.out.println("\nTranspose:");
        printMatrix(result);
    }
}