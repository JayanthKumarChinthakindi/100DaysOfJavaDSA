public class MatrixOperations {
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
    // Find average
    static double findAverage(int[][] matrix) {
        int sum = findSum(matrix);
        int totalElements = 0;
        for (int row = 0; row < matrix.length; row++) {
            totalElements += matrix[row].length;
        }
        return (double) sum / totalElements;
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
    // Count even elements
    static int countEven(int[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    // Count odd elements
    static int countOdd(int[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
    // Print row sums
    static void printRowSums(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
            System.out.println(
                "Row " + row + " Sum = " + sum
            );
        }
    }
    // Print column sums
    static void printColumnSums(int[][] matrix) {
        int columns = matrix[0].length;
        for (int col = 0; col < columns; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            System.out.println(
                "Column " + col + " Sum = " + sum
            );
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("\nTotal Sum: " + findSum(matrix));
        System.out.println("Average: " + findAverage(matrix));
        System.out.println("Maximum: " + findMaximum(matrix));
        System.out.println("Minimum: " + findMinimum(matrix));
        System.out.println("Even Count: " + countEven(matrix));
        System.out.println("Odd Count: " + countOdd(matrix));
        System.out.println("\nRow Sums:");
        printRowSums(matrix);
        System.out.println("\nColumn Sums:");
        printColumnSums(matrix);
    }
}