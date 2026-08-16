import java.util.Scanner;
public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }
    static double subtract(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static double divide(double a, double b) {
        return a / b;
    }
    static double modulus(double a, double b) {
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = add(first, second);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(first, second);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(first, second);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (second == 0) {
                    System.out.println( "Error: Cannot divide by zero.");
                } else {
                    result = divide(first, second);
                    System.out.println("Result: " + result);
                }
                break;
            case 5:
                if (second == 0) {
                    System.out.println("Error: Cannot calculate modulus by zero.");
                } else {
                    result = modulus(first, second);
                    System.out.println("Result: " + result);
                }
                break;
            case 6:
                System.out.println("Calculator closed.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}