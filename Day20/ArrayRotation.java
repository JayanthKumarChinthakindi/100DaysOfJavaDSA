import java.util.Scanner;
public class ArrayRotation {
    // Reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Left rotate by one position
    static void leftRotateByOne(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }
    // Right rotate by one position
    static void rightRotateByOne(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
    // Left rotate by k positions
    static void leftRotate(int[] arr, int k) {
        if (arr.length == 0) {
            return;
        }
        k = k % arr.length;
        if (k < 0) {
            k += arr.length;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    // Right rotate by k positions
    static void rightRotate(int[] arr, int k) {
        if (arr.length == 0) {
            return;
        }
        k = k % arr.length;
        if (k < 0) {
            k += arr.length;
        }
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
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
        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();
        System.out.println();
        System.out.print("Original Array: ");
        printArray(numbers);
        int[] leftArray = numbers.clone();
        int[] rightArray = numbers.clone();
        leftRotate(leftArray, k);
        rightRotate(rightArray, k);
        System.out.print("Left Rotation by " + k + ": ");
        printArray(leftArray);
        System.out.print("Right Rotation by " + k + ": ");
        printArray(rightArray);
        sc.close();
    }
}