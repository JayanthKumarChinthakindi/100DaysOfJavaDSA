public class MethodBasics {
    // Method without parameters
    static void greet() {
        System.out.println("Welcome to Day 18!");
    }
    // Method with one parameter
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    // Method with two parameters
    static void addNumbers(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    // Method with a return value
    static int multiply(int a, int b) {
        return a * b;
    }
    // Method returning a boolean
    static boolean isAdult(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        // Calling method without parameters
        greet();
        // Calling method with parameter
        greetUser("Jayanth");
        // Calling method with two parameters
        addNumbers(10, 20);
        // Storing returned value
        int result = multiply(5, 4);
        System.out.println("Multiplication = " + result);
        // Using boolean method
        int age = 20;
        if (isAdult(age)) {
            System.out.println("The person is an adult.");
        } else {
            System.out.println("The person is not an adult.");
        }
    }
}