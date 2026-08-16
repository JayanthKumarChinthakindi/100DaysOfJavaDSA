import java.util.Scanner;
public class LeapYearChecker {
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LEAP YEAR CHECKER");
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year <= 0) {
            System.out.println("Invalid year.");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        sc.close();
    }
}