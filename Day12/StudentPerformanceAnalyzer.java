import java.util.Scanner;
public class StudentPerformanceAnalyzer {
    static int findTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    static double findAverage(int[] marks) {
        int total = findTotal(marks);
        return (double) total / marks.length;
    }
    static int findMaximum(int[] marks) {
        int maximum = marks[0];
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }
    static int findMinimum(int[] marks) {
        int minimum = marks[0];
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }
    static int countPassed(int[] marks) {
        int count = 0;
        for (int mark : marks) {
            if (mark >= 40) {
                count++;
            }
        }
        return count;
    }
    static int countFailed(int[] marks) {
        int count = 0;
        for (int mark : marks) {
            if (mark < 40) {
                count++;
            }
        }
        return count;
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
        System.out.println("STUDENT PERFORMANCE ANALYZER");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
        // Validate marks
        if (!areMarksValid(marks)) {
            System.out.println("Invalid marks! " + "Marks must be between 0 and 100.");
            sc.close();
            return;
        }
        int total = findTotal(marks);
        double average = findAverage(marks);
        int maximum = findMaximum(marks);
        int minimum = findMinimum(marks);
        int passed = countPassed(marks);
        int failed = countFailed(marks);
        char grade = calculateGrade(average);
        System.out.println("RESULTS");
        System.out.println("Total Marks: " + total);
        System.out.printf( "Average: %.2f%n",average);
        System.out.println("Highest Mark: " + maximum);
        System.out.println("Lowest Mark: " + minimum);
        System.out.println("Passed Subjects: " + passed);
        System.out.println("Failed Subjects: " + failed);
        System.out.println("Overall Grade: " + grade);
        if (failed == 0) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        sc.close();
    }
}