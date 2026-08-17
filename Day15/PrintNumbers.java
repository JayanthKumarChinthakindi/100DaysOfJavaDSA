import java.util.Scanner;
public class PrintNumbers {
    static void printFromOneToN(int n) {
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printFromNToOne(int n) {
        System.out.println("Numbers from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printEvenNumbers(int n) {
        System.out.println("Even numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static void printOddNumbers(int n) {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Enter a positive number.");
        } else {
            printFromOneToN(n);
            printFromNToOne(n);
            printEvenNumbers(n);
            printOddNumbers(n);
        }
        sc.close();
    }
}