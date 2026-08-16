import java.util.Scanner;
public class StudentGradeCalculator {
    static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    static double calculateAverage(int[] marks) {
        int total = calculateTotal(marks);
        return (double) total / marks.length;
    }
    static boolean isPassed(int[] marks) {
        for (int mark : marks) {
            if (mark < 40) {
                return false;
            }
        }
        return true;
    }
    static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else if (average >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
    static boolean areMarksValid(int[] marks) {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {
                "English",
                "Mathematics",
                "Java",
                "DSA",
                "Computer Science"
        };
        int[] marks = new int[subjects.length];
        System.out.println("STUDENT GRADE CALCULATOR");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] +": ");
            marks[i] = sc.nextInt();
        }
        if (!areMarksValid(marks)) {
            System.out.println("Invalid marks!");
            System.out.println("Marks must be between 0 and 100.");
            sc.close();
            return;
        }
        int total = calculateTotal(marks);
        double average = calculateAverage(marks);
        boolean passed = isPassed(marks);
        char grade = calculateGrade(average);
        System.out.println("RESULT");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f%n",average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " +(passed ? "PASS" : "FAIL"));
        sc.close();
    }
}