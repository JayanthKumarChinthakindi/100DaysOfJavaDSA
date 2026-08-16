import java.util.Scanner;
public class ElectricityBillCalculator {
    static double calculateBill(int units) {
        double bill;
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else if (units <= 300) {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        } else {
            bill = (100 * 2) + (100 * 3) + (100 * 5) + ((units - 300) * 7);
        }
        // Fixed service charge
        bill += 50;
        return bill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ELECTRICITY BILL CALCULATOR");
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        if (units < 0) {
            System.out.println("Invalid input. Units cannot be negative.");
        } else {
            double bill = calculateBill(units);
            System.out.println("BILL DETAILS");
            System.out.println("Units Consumed: " + units);
            System.out.println("Electricity Bill: ₹" + bill);
        }
        sc.close();
    }
}