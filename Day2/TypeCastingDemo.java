public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Type Casting
        int number = 100;
        double value = number;
        System.out.println("Implicit Casting");
        System.out.println("Integer : " + number);
        System.out.println("Double  : " + value);
        System.out.println();
        // Explicit Type Casting
        double pi = 3.14159;
        int integerValue = (int) pi;
        System.out.println("Explicit Casting");
        System.out.println("Double : " + pi);
        System.out.println("Integer: " + integerValue);
        System.out.println();
        float salary = 45678.99f;
        int salaryInt = (int) salary;
        System.out.println("Salary Float : " + salary);
        System.out.println("Salary Int   : " + salaryInt);
    }
}