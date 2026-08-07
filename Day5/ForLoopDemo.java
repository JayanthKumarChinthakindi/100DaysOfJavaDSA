public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\nEven Numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println("\nCountdown:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}