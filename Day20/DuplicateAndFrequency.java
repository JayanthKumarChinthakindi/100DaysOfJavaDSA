import java.util.Scanner;
public class DuplicateAndFrequency {
    // Display frequency of every unique element
    static void displayFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        System.out.println("Element Frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
    // Check whether an element already exists
    static boolean contains(int[] arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
    // Remove duplicates
    static int[] removeDuplicates(int[] arr) {
        int[] unique = new int[arr.length];
        int size = 0;
        for (int value : arr) {
            if (!contains(unique, size, value)) {
                unique[size] = value;
                size++;
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = unique[i];
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
        displayFrequency(numbers);
        System.out.println();
        int[] unique = removeDuplicates(numbers);
        System.out.print("Array after removing duplicates: ");
        printArray(unique);
        sc.close();
    }
}