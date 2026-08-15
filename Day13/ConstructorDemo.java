class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println(
            "No-argument constructor called."
        );
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("STUDENT DETAILS");
        student.displayDetails();
    }
}