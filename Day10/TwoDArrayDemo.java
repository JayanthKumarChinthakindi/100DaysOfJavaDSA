public class TwoDArrayDemo {
    public static void main(String[] args) {
        // 2D array declaration and initialization
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        // Accessing individual elements
        System.out.println("First Element: " + matrix[0][0]);
        System.out.println("Center Element: " + matrix[1][1]);
        System.out.println("Last Element: " + matrix[2][2]);
        // Updating an element
        matrix[1][1] = 500;
        System.out.println("\nAfter Updating Center Element:");
        System.out.println(matrix[1][1]);
        // Number of rows
        System.out.println("\nNumber of Rows: " + matrix.length);
        // Number of columns
        System.out.println("Number of Columns: " + matrix[0].length);
        // Display matrix
        System.out.println("\nMatrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}