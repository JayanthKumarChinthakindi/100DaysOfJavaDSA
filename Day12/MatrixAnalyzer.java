import java.util.Scanner;
public class MatrixAnalyzer {
    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
    static int findSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }
    static int findMaximum(int[][] matrix) {
        int maximum = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > maximum) {
                    maximum = matrix[row][col];
                }
            }
        }
        return maximum;
    }
    static int findMinimum(int[][] matrix) {
        int minimum = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < minimum) {
                    minimum = matrix[row][col];
                }
            }
        }
        return minimum;
    }
    static void printRowSums(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
            System.out.println("Row " + row + " = " + sum);
        }
    }
    static void printColumnSums(int[][] matrix) {
        int columns = matrix[0].length;
        for (int col = 0; col < columns; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            System.out.println("Column " + col + " = " + sum);
        }
    }
    static void printMainDiagonal(int[][] matrix) {
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
    static void printSecondaryDiagonal(int[][] matrix) {
        int n = matrix.length;
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }
        System.out.println();
    }
    static int mainDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    static int secondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }
    static void searchElement(
        int[][] matrix,
        int target
    ) {
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    System.out.println("Element found at Row = " +row +", Column = " +col);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
    static boolean isSquareMatrix(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MATRIX ANALYZER");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print("Element [" +row +"][" +col +"]: ");
                matrix[row][col] = sc.nextInt();
            }
        }
        System.out.println("MATRIX");
        printMatrix(matrix);
        System.out.println("Total Sum: " +findSum(matrix));
        System.out.println("Maximum: " +findMaximum(matrix));
        System.out.println("Minimum: " +findMinimum(matrix));
        System.out.println("Row Sums:");
        printRowSums(matrix);
        System.out.println("Column Sums:");
        printColumnSums(matrix);
        if (isSquareMatrix(matrix)) {
            System.out.println();
            printMainDiagonal(matrix);
            printSecondaryDiagonal(matrix);
            System.out.println("Main Diagonal Sum: " +mainDiagonalSum(matrix));
            System.out.println("Secondary Diagonal Sum: " +secondaryDiagonalSum(matrix));
        } else {
            System.out.println("Diagonal operations require " +"a square matrix.");
        }
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        searchElement(matrix, target);
        sc.close();
    }
}