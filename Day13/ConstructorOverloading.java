class Student {
    String name;
    int age;
    String course;
    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }
    // Constructor 2
    Student(String name) {
        this.name = name;
        age = 0;
        course = "Not Assigned";
    }
    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        course = "Not Assigned";
    }
    // Constructor 4
    Student(
        String name,
        int age,
        String course
    ) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student student1 =
            new Student();
        Student student2 =
            new Student("Rahul");
        Student student3 =
            new Student("Priya", 21);
        Student student4 =
            new Student(
                "Amit",
                22,
                "Java & DSA"
            );
        System.out.println("STUDENT 1");
        student1.displayDetails();
        System.out.println("STUDENT 2");
        student2.displayDetails();
        System.out.println("STUDENT 3");
        student3.displayDetails();
        System.out.println("STUDENT 4");
        student4.displayDetails();
    }
}