import java.util.Scanner;
public class MatrixInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        // Input matrix elements
        System.out.println("\nEnter matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(
                    "Element [" + row + "][" + col + "]: "
                );
                matrix[row][col] = sc.nextInt();
            }
        }
        // Display matrix
        System.out.println("\nMatrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}