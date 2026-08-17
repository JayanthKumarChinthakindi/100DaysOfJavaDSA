public class ArrayDemo {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};
        // Accessing elements
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Third Element: " + numbers[2]);
        System.out.println("Last Element: " + numbers[numbers.length - 1]);
        // Updating an element
        numbers[2] = 100;
        System.out.println("\nAfter Updating Third Element:");
        System.out.println("Third Element: " + numbers[2]);
        // Array length
        System.out.println("\nArray Length: " + numbers.length);
        // Display complete array
        System.out.println("\nArray Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}