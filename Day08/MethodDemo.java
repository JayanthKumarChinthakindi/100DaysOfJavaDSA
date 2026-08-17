public class MethodDemo {
    // Method without parameters
    static void greet() {
        System.out.println("Welcome to #100DaysOfJavaDSA!");
    }
    static void printMessage() {
        System.out.println("Learning Java Methods.");
    }
    static void printNumbers() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Method Demo");
        greet();
        printMessage();
        System.out.println("\nNumbers:");
        printNumbers();
    }
}