import java.util.Scanner;
public class ReverseAndSortCheck {
    // Reverse the array in-place
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    // Check whether array is sorted in ascending order
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
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
        System.out.print("Original array: ");
        printArray(numbers);
        if (isSorted(numbers)) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
        reverse(numbers);
        System.out.print("Reversed array: ");
        printArray(numbers);
        sc.close();
    }
}