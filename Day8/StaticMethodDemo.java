public class StaticMethodDemo {
    static void greet() {
        System.out.println("Hello from a static method!");
    }
    static int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        // Calling static method directly
        greet();
        int sum = add(10, 20);
        System.out.println("Sum = " + sum);
        int product = multiply(5, 4);
        System.out.println("Product = " + product);
    }
}