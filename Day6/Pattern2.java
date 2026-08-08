public class Pattern2 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= columns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}