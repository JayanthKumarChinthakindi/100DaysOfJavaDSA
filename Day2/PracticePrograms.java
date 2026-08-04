public class PracticePrograms {
    public static void main(String[] args) {
        // Program 1
        System.out.println("----- Program 1 -----");
        String name = "Jayanth";
        int age = 22;
        String city = "Hyderabad";
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("City : " + city);
        // Program 2
        System.out.println("\n----- Program 2 -----");
        int a = 10;
        int b = 20;
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Program 3
        System.out.println("\n----- Program 3 -----");
        int length = 10;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("Area = " + area);
        // Program 4
        System.out.println("\n----- Program 4 -----");
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature = " + fahrenheit);
        // Program 5
        System.out.println("\n----- Program 5 -----");
        int principal = 10000;
        int time = 2;
        int rate = 8;
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        // Program 6
        System.out.println("\n----- Program 6 -----");
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        double average = (n1 + n2 + n3) / 3.0;
        System.out.println("Average = " + average);
        // Program 7
        System.out.println("\n----- Program 7 -----");
        System.out.println("Remainder = " + (25 % 4));
        // Program 8
        System.out.println("\n----- Program 8 -----");
        int number = 18;
        System.out.println("Even Number? " + (number % 2 == 0));
        // Program 9
        System.out.println("\n----- Program 9 -----");
        int num = 50;
        double d = num;
        System.out.println("Implicit : " + d);
        double pi = 9.99;
        int value = (int) pi;
        System.out.println("Explicit : " + value);
        // Program 10
        System.out.println("\n----- Program 10 -----");
        int x = 10;
        System.out.println("Pre Increment : " + (++x));
        int y = 10;
        System.out.println("Post Increment : " + (y++));
        System.out.println("After Post Increment : " + y);
    }
}