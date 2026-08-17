import java.util.Scanner;
public class CountDigits {
    static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}