import java.util.Scanner;
public class HollowRectangle {
    static void printPattern(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows ||
                    j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
        } else {
            printPattern(rows, columns);
        }
        sc.close();
    }
}