import java.util.Scanner;
public class PracticePrograms {
    // Print matrix
    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    // Find total sum
    static int findSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }
    // Find maximum
    static int findMaximum(int[][] matrix) {
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
        }
        return max;
    }
    // Find minimum
    static int findMinimum(int[][] matrix) {
        int min = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
        }
        return min;
    }
    // Count even numbers
    static int countEven(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    // Count odd numbers
    static int countOdd(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
    // Row sums
    static void printRowSums(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
            System.out.println("Row " + row + " Sum = " + sum );
        }
    }
    // Column sums
    static void printColumnSums(int[][] matrix) {
        int columns = matrix[0].length;
        for (int col = 0; col < columns; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            System.out.println("Column " + col + " Sum = " + sum );
        }
    }
    // Main diagonal
    static void printMainDiagonal(int[][] matrix) {
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
    // Secondary diagonal
    static void printSecondaryDiagonal(int[][] matrix) {
        int n = matrix.length;
        System.out.print("Secondary Diagonal: ");
        for (int row = 0; row < n; row++) {
            System.out.print( matrix[row][n - 1 - row] + " ");
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
    // Search element
    static void searchElement(int[][] matrix, int target) {
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    System.out.println("Element found at [" +row + "][" + col + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
     // Check square matrix
    static boolean isSquareMatrix(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }
    // Find largest row sum
    static int largestRowSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("\nEnter matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        // 1. Print Matrix
        System.out.println("\n1. Matrix:");
        printMatrix(matrix);
        // 2. Total Sum
        System.out.println("\n2. Total Sum: " + findSum(matrix));
        // 3. Maximum
        System.out.println("3. Maximum: " + findMaximum(matrix));
        // 4. Minimum
        System.out.println("4. Minimum: " + findMinimum(matrix));
        // 5. Even Count
        System.out.println("5. Even Count: " + countEven(matrix));
        // 6. Odd Count
        System.out.println("6. Odd Count: " + countOdd(matrix));
        // 7. Row Sums
        System.out.println("\n7. Row Sums:");
        printRowSums(matrix);
        // 8. Column Sums
        System.out.println("\n8. Column Sums:");
        printColumnSums(matrix);
        // Diagonal operations only make sense for square matrices
        if (isSquareMatrix(matrix)) {
            // 9. Main diagonal
            System.out.println("\n9. Diagonal Operations:");
            printMainDiagonal(matrix);
            // 10. Secondary diagonal
            printSecondaryDiagonal(matrix);
            // 11. Main diagonal sum
            System.out.println("Main Diagonal Sum: " + mainDiagonalSum(matrix) );
            // 12. Secondary diagonal sum
            System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum(matrix));
        } else {
            System.out.println("\nDiagonal operations skipped.");
            System.out.println("Matrix is not square." );
        }
        // 13. Search
        System.out.print("\n13. Enter element to search: " );
        int target = sc.nextInt();
        searchElement(matrix, target);
        // 14. Square Matrix Check
        System.out.println("\n14. Is Square Matrix? " + isSquareMatrix(matrix));
        // 15. Largest Row Sum
        System.out.println("15. Largest Row Sum: " +largestRowSum(matrix));
        sc.close();
    }
}