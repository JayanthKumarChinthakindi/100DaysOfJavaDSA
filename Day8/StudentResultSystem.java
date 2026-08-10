import java.util.Scanner;
public class StudentResultSystem {
    // Calculate total marks
    static int calculateTotal(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }
    // Calculate average
    static double calculateAverage(int total) {
        return total / 3.0;
    }
    // Check whether student passed
    static boolean isPassed(double average) {
        return average >= 35;
    }
    // Calculate grade
    static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 35) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Display result
    static void displayResult(
            String name,
            int rollNumber,
            int total,
            double average,
            boolean passed,
            char grade) {
        System.out.println("       STUDENT RESULT");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Grade      : " + grade);
        if (passed) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        // Marks
        System.out.print("Enter marks for Subject 1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int mark3 = sc.nextInt();
        // Method calls
        int total = calculateTotal(mark1, mark2, mark3);
        double average = calculateAverage(total);
        boolean passed = isPassed(average);
        char grade = calculateGrade(average);
        // Display result
        displayResult(
                name,
                rollNumber,
                total,
                average,
                passed,
                grade
        );
        sc.close();
    }
}