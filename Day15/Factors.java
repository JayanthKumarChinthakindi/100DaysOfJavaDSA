import java.util.Scanner;
public class Factors {
    static void printFactors(int number) {
        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFactors(number);
        }
        sc.close();
    }
}