public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // Upper Half
        for (int row = 1; row <= n; row++) {
             // Left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // Spaces
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }
            // Right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for (int row = n - 1; row >= 1; row--) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // Spaces
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }
            // Right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}