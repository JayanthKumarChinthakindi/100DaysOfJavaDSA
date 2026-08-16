import java.util.Scanner;
public class LargestOfThree {
    static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    static int findSmallest(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LARGEST OF THREE");
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        int largest = findLargest(first, second, third);
        int smallest = findSmallest(first, second, third);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        sc.close();
    }
}