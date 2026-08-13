public class StringTraversalDemo {
    public static void main(String[] args) {
        String text = "JavaProgramming";
        System.out.println("String: " + text);
        System.out.println("\nCharacters:");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println("Index " + i + " = " + ch);
        }
        // Print characters on the same line
        System.out.println("\nCharacters in one line:");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        // Reverse traversal
        System.out.println("\n\nReverse Traversal:");
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}