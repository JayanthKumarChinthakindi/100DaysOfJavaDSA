public class PracticePatterns {
    public static void main(String[] args) {
        int n = 5;
        // Pattern 1: Increasing Stars
        System.out.println("Pattern 1:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pattern 2: Decreasing Stars
        System.out.println("\nPattern 2:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pattern 3: Increasing Numbers
        System.out.println("\nPattern 3:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        // Pattern 4: Same Row Number
        System.out.println("\nPattern 4:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        // Pattern 5: Continuous Numbers
        System.out.println("\nPattern 5:");
        int number = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        // Pattern 6: Binary Pattern
        System.out.println("\nPattern 6:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}