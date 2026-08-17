public class ParameterDemo {
    // One parameter
    static void greetUser(String name) {

        System.out.println("Hello " + name + "!");
    }
    // Two parameters
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
    // Multiple parameters
    static void studentDetails(String name, int age, int rollNumber) {
        System.out.println("\nStudent Details");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
    public static void main(String[] args) {
        greetUser("Rahul");
        addNumbers(10, 20);
        studentDetails("Amit", 20, 101);
    }
}