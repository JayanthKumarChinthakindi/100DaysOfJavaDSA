import java.util.Scanner;
public class ArrayBasicsPractice {
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
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }
        return secondLargest;
    }
    // Find second smallest distinct element
    static int secondSmallest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MAX_VALUE;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }
        return secondSmallest;
    }
    // Compare two arrays
    static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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
        System.out.print("Enter first array size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        int secondLargest = secondLargest(arr1);
        int secondSmallest = secondSmallest(arr1);
        System.out.print("Array: ");
        printArray(arr1);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest distinct element does not exist.");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest distinct element does not exist.");
        } else {
            System.out.println("Second Smallest = " + secondSmallest);
        }
        System.out.println();
        System.out.print("Enter second array size: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
        sc.close();
    }
}