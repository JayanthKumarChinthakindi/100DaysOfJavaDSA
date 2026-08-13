public class StringComparisonDemo {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";
        String third = new String("Java");
        String fourth = "JAVA";
        // == comparison
        System.out.println("Using ==:");
        System.out.println("first == second: " + (first == second));
        System.out.println("first == third: " + (first == third));
        // equals()
        System.out.println("\nUsing equals():");
        System.out.println("first.equals(second): " + first.equals(second));
        System.out.println("first.equals(third): " + first.equals(third));
        // equalsIgnoreCase()
        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println("first.equalsIgnoreCase(fourth): " + first.equalsIgnoreCase(fourth));
        // compareTo()
        System.out.println("\nUsing compareTo():");
        System.out.println("Java vs Java: " + first.compareTo(second));
        System.out.println("Java vs JAVA: " + first.compareTo(fourth));
        // compareToIgnoreCase()
        System.out.println("\nUsing compareToIgnoreCase():");
         System.out.println(first.compareToIgnoreCase(fourth));
    }
}