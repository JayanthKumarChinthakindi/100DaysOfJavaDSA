import java.util.Scanner;
public class ArrayOperations {
    // Find maximum element
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // Find minimum element
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // Count even elements
    static int countEven(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    // Count odd elements
    static int countOdd(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Maximum = " + findMax(numbers));
        System.out.println("Minimum = " + findMin(numbers));
        System.out.println("Even Count = " + countEven(numbers));
        System.out.println("Odd Count = " + countOdd(numbers));
        sc.close();
    }
}