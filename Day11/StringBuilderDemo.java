public class StringBuilderDemo {
        public static void main(String[] args) {
        // Empty StringBuilder
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        System.out.println("StringBuilder 1:");
        System.out.println(sb1);
        // StringBuilder with initial value
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("\nStringBuilder 2:");
        System.out.println(sb2);
        // Append
        sb2.append(" Programming");
        System.out.println("\nAfter append:");
        System.out.println(sb2);
        // Insert
        sb2.insert(4, " Language");
        System.out.println("\nAfter insert:");
        System.out.println(sb2);
        // Length
        System.out.println("\nLength:");
        System.out.println(sb2.length());
        // Character access
        System.out.println("\nCharacter at index 0:");
        System.out.println(sb2.charAt(0));
        // Set character
        sb2.setCharAt(0, 'K');
        System.out.println("\nAfter setCharAt:");
        System.out.println(sb2);
        // Reverse
        sb2.reverse();
        System.out.println("\nAfter reverse:");
        System.out.println(sb2);
    }
}