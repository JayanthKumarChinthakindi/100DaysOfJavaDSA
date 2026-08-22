import java.util.Scanner;
public class MissingAndDuplicate {
    // Find missing number from 1 to n
    static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int value : arr) {
            actualSum += value;
        }
        return expectedSum - actualSum;
    }
    // Find duplicate using nested loops
    static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for numbers from 1 to n: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("n must be greater than 1.");
            sc.close();
            return;
        }
        int[] missingArray = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers with one number missing:");
        for (int i = 0; i < missingArray.length; i++) {
            missingArray[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        printArray(missingArray);
        int missing = findMissing(missingArray, n);
        System.out.println("Missing Number = " + missing);
        System.out.println();
        System.out.print("Enter size for duplicate array: ");
        int size = sc.nextInt();
        int[] duplicateArray = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            duplicateArray[i] = sc.nextInt();
        }
        int duplicate = findDuplicate(duplicateArray);
        if (duplicate == -1) {
            System.out.println("No duplicate found.");
        } else {
            System.out.println("Duplicate Number = " + duplicate);
        }
        sc.close();
    }
}