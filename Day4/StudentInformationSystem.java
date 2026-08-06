import java.util.Scanner;
public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks in Subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        int subject3 = sc.nextInt();
        // Processing
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;
        String result;
        if (average >= 35) {
            result = "PASS";
        } else {
            result = "FAIL";
        }
        // Output
        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Age        : " + age);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Result     : " + result);
        sc.close();
    }
}