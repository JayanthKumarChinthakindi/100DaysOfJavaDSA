class StudentRecord {
    String name;
    int rollNumber;
    double marks;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    boolean isPassed() {
        return marks >= 40;
    }
}
public class Student {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        student.name = "Rahul";
        student.rollNumber = 101;
        student.marks = 85.5;
        System.out.println("STUDENT DETAILS");
        student.displayDetails();
        if (student.isPassed()) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}