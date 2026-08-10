public class MethodOverloadingDemo {
    // Two integer parameters
    static int add(int a, int b) {
        return a + b;
    }
    // Three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    // Two double parameters
    static double add(double a, double b) {
        return a + b;
    }
    // Different parameter type
    static String add(String first, String second) {
        return first + " " + second;
    }
    public static void main(String[] args) {
        System.out.println("Two integers: " + add(10, 20));
        System.out.println("Three integers: " + add(10, 20, 30));
        System.out.println("Two doubles: " + add(10.5, 20.5));
        System.out.println("Two strings: " + add("Hello", "Java"));
    }
}