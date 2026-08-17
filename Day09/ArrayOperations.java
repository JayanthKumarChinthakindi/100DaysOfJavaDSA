public class ArrayOperations {
    // Calculate sum
    static int findSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    // Calculate average
    static double findAverage(int[] numbers) {
        int sum = findSum(numbers);
        return (double) sum / numbers.length;
    }
    // Find maximum
    static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    // Find minimum
    static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    // Count even numbers
    static int countEven(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    // Count odd numbers
    static int countOdd(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50, 65};
        System.out.println("Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
        System.out.println("Sum       : " + findSum(numbers));
        System.out.println("Average   : " + findAverage(numbers));
        System.out.println("Maximum   : " + findMaximum(numbers));
        System.out.println("Minimum   : " + findMinimum(numbers));
        System.out.println("Even Count: " + countEven(numbers));
        System.out.println("Odd Count : " + countOdd(numbers));
    }
}