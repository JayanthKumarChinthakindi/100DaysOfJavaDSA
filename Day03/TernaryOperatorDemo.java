public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int age = 17;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
        int number = 10;
        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + evenOdd);
    }
}
