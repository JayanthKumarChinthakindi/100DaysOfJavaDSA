import java.util.Scanner;
public class ArrayInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("\nArray Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}