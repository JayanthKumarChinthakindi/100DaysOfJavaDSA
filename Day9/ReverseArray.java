public class ReverseArray {
    // Print array
    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    // Print array in reverse
    static void printReverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    // Create a reversed array
    static int[] reverseArray(int[] numbers) {
        int[] reversed = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[index] = numbers[i];
            index++;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        printArray(numbers);
        System.out.println("\nArray in Reverse:");
        printReverse(numbers);
        int[] reversed = reverseArray(numbers);
        System.out.println("\nReversed Array:");
        printArray(reversed);
    }
}