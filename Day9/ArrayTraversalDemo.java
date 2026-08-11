public class ArrayTraversalDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        // Traditional For Loop
        System.out.println("Using Traditional For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Index " + i + " = " + numbers[i]
            );
        }
        // Enhanced For Loop
        System.out.println("\nUsing Enhanced For Loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}