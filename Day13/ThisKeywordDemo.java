class Student {
    String name;
    int age;
    double marks;
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
    }
}
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student student =
            new Student(
                "Rahul",
                20,
                87.5
            );
        System.out.println("STUDENT DETAILS");
        student.displayDetails();
    }
}