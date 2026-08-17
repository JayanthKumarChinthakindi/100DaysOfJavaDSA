import java.util.Scanner;
public class BasicCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter Operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            case '%':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 % num2));
                else
                    System.out.println("Cannot perform modulus by zero.");
                break;
            default:
                System.out.println("Invalid Operator!");
        }
        sc.close();
    }
}