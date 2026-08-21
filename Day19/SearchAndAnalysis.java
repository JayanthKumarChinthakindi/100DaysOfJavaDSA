import java.util.Scanner;
public class SearchAndAnalysis {
    // Linear search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // Count how many times target occurs
    static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int value : arr) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
    // Find second largest distinct element
    static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest &&
                       value != largest) {
                secondLargest = value;
            }
        }
        return secondLargest;
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
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int index = linearSearch(numbers, target);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First occurrence index = " + index);
        }
        System.out.println("Occurrences = " + countOccurrences(numbers, target));
        int second = secondLargest(numbers);
        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest distinct element does not exist.");
        } else {
            System.out.println("Second largest = " + second);
        }
        sc.close();
    }
}