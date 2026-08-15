class Student {
    String name;
    int age;
    String course;
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student student1 =
            new Student(
                "Rahul",
                20,
                "Java & DSA"
            );
        Student student2 =
            new Student(
                "Priya",
                21,
                "Computer Science"
            );
        System.out.println("STUDENT 1");
        student1.displayDetails();
        System.out.println("STUDENT 2");
        student2.displayDetails();
    }
}