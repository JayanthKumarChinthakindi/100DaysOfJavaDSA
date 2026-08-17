public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println("Arithmetic Operators");
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));
        System.out.println();
        System.out.println("Comparison Operators");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println();
        System.out.println("Logical Operators");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println();
        System.out.println("Assignment Operators");
        int num = 10;
        num += 5;
        System.out.println("+= : " + num);
        num -= 3;
        System.out.println("-= : " + num);
        num *= 2;
        System.out.println("*= : " + num);
        num /= 4;
        System.out.println("/= : " + num);
        num %= 5;
        System.out.println("%= : " + num);
    }
}