import java.util.Scanner;
public class ArrayMethods {
    // Display all array elements
    static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    // Calculate sum
    static int sum(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }
    // Calculate average
    static double average(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double) sum(arr) / arr.length;
    }
    // Display array using index-based loop
    static void printUsingIndex(int[] arr) {
        System.out.print("Using index: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        printArray(numbers);
        printUsingIndex(numbers);
        System.out.println("Sum = " + sum(numbers));
        System.out.println("Average = " + average(numbers));
        sc.close();
    }
}