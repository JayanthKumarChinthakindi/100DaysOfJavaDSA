import java.util.Scanner;
public class ArrayManipulation {
    // Move all zeros to the end
    static void moveZerosToEnd(int[] arr) {
        int position = 0;
        // Move non-zero elements forward
        for (int value : arr) {
            if (value != 0) {
                arr[position] = value;
                position++;
            }
        }
        // Fill remaining positions with zeros
        while (position < arr.length) {
            arr[position] = 0;
            position++;
        }
    }
    // Display even and odd elements separately
    static void displayEvenOdd(int[] arr) {
        System.out.print("Even Elements: ");
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Elements: ");
        for (int value : arr) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
    // Merge two arrays
    static int[] mergeArrays(
            int[] arr1,
            int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int value : arr1) {
            result[index] = value;
            index++;
        }
        for (int value : arr2) {
            result[index] = value;
            index++;
        }
        return result;
    }
    // Print array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First array
        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        // Move zeros
        System.out.print("Original Array: ");
        printArray(arr1);
        moveZerosToEnd(arr1);
        System.out.print("After moving zeros: ");
        printArray(arr1);
        // Even and odd
        displayEvenOdd(arr1);
        System.out.println();
        // Second array
        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        // Merge
        int[] merged = mergeArrays(arr1,arr2);
        System.out.print("Merged Array: ");
        printArray(merged);
        sc.close();
    }
}