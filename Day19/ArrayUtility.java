import java.util.Scanner;
public class ArrayUtility {
    // Display array
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
    // Find maximum
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // Find minimum
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // Linear search
    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // Count occurrences
    static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int value : arr) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
    // Count even numbers
    static int countEven(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Count odd numbers
    static int countOdd(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    // Reverse array in-place
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
    // Check if array is sorted
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
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
    // Display menu
    static void displayMenu() {
        System.out.println();
        System.out.println("ARRAY UTILITY");
        System.out.println("1. Display Array");
        System.out.println("2. Sum");
        System.out.println("3. Average");
        System.out.println("4. Maximum");
        System.out.println("5. Minimum");
        System.out.println("6. Linear Search");
        System.out.println("7. Count Occurrences");
        System.out.println("8. Count Even Numbers");
        System.out.println("9. Count Odd Numbers");
        System.out.println("10. Reverse Array");
        System.out.println("11. Check Sorted");
        System.out.println("12. Second Largest");
        System.out.println("0. Exit");
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
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printArray(numbers);
                    break;
                case 2:
                    System.out.println("Sum = " + sum(numbers));
                    break;
                case 3:
                    System.out.println("Average = " + average(numbers));
                    break;
                case 4:
                    System.out.println("Maximum = " + findMax(numbers));
                    break;
                case 5:
                    System.out.println("Minimum = " + findMin(numbers));
                    break;
                case 6: {
                    System.out.print("Enter target: ");
                    int target = sc.nextInt();
                    int index = search(numbers, target);
                    if (index == -1) {
                        System.out.println("Element not found.");
                    } else {
                        System.out.println("Element found at index: " + index);
                    }
                    break;
                }
                case 7: {
                    System.out.print("Enter target: ");
                    int target = sc.nextInt();
                    System.out.println("Occurrences = " + countOccurrences(numbers, target));
                    break;
                }
                case 8:
                    System.out.println("Even Count = " + countEven(numbers));
                    break;
                case 9:
                    System.out.println("Odd Count = " + countOdd(numbers));
                    break;
                case 10:
                    reverse(numbers);
                    System.out.println("Array reversed successfully.");
                    printArray(numbers);
                    break;
                case 11:
                    if (isSorted(numbers)) {
                        System.out.println("Array is sorted.");
                    } else {
                        System.out.println("Array is not sorted.");
                    }
                    break;
                case 12: {
                    int second = secondLargest(numbers);
                    if (second == Integer.MIN_VALUE) {
                        System.out.println("Second largest distinct element does not exist.");
                    } else {
                        System.out.println("Second Largest = " + second);
                    }
                    break;
                }
                case 0:
                    System.out.println("Array Utility closed.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}