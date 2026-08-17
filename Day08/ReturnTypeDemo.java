public class ReturnTypeDemo {
    // Returns an integer
    static int add(int a, int b) {
        return a + b;
    }
    // Returns an integer
    static int square(int number) {
        return number * number;
    }
    // Returns a double
    static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    // Returns a boolean
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // Returns a String
    static String getMessage() {
        return "Java Methods are powerful!";
    }
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum = " + sum);
        int result = square(5);
        System.out.println("Square = " + result);
        double average = calculateAverage(80, 90, 70);
        System.out.println("Average = " + average);
        boolean even = isEven(10);
        System.out.println("Is Even? " + even);
        String message = getMessage();
        System.out.println(message);
    }
}