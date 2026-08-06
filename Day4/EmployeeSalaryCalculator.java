import java.util.Scanner;
public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        double bonus;
        if (basicSalary >= 50000) {
            bonus = basicSalary * 0.20;
        } else if (basicSalary >= 30000) {
            bonus = basicSalary * 0.10;
        } else {
            bonus = basicSalary * 0.05;
        }
        double totalSalary = basicSalary + bonus;
        String category = (totalSalary >= 60000)
                ? "High Earner"
                : "Regular Earner";
        System.out.println("\n========== EMPLOYEE DETAILS ==========");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("Bonus         : ₹" + bonus);
        System.out.println("Total Salary  : ₹" + totalSalary);
        System.out.println("Category      : " + category);
        sc.close();
    }
}