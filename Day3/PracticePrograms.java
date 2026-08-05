import java.util.Scanner;
public class PracticePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Program 1
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
        // Program 2
        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible");
        // Program 3
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
        // Program 4
        System.out.print("\nEnter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is Largest");
        else
            System.out.println(b + " is Largest");
        // Program 5
        System.out.print("\nEnter Marks: ");
        int marks = sc.nextInt();
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 60)
            System.out.println("Grade C");
        else if (marks >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
        // Program 6
        System.out.print("\nEnter a Number: ");
        int number = sc.nextInt();
        if (number > 0)
            System.out.println("Positive");
        else if (number < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        // Program 7
        System.out.print("\nEnter Day Number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        // Program 8
        System.out.print("\nEnter Character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        // Program 9
        System.out.print("\nEnter Number: ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 11 == 0)
            System.out.println("Divisible by 5 and 11");
        else
            System.out.println("Not Divisible");
        // Program 10
        System.out.print("\nEnter Number: ");
        int x = sc.nextInt();
        String result = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        sc.close();
    }
}