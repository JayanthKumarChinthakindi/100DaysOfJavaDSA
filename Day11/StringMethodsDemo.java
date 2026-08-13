public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        System.out.println("Original String:");
        System.out.println("'" + text + "'");
        // length()
        System.out.println("\nLength:");
        System.out.println(text.length());
        // trim()
        System.out.println("\nTrim:");
        System.out.println("'" + text.trim() + "'");
        // toUpperCase()
        System.out.println("\nUppercase:");
        System.out.println(text.toUpperCase());
        // toLowerCase()
        System.out.println("\nLowercase:");
        System.out.println(text.toLowerCase());
        String word = "Programming";
        // charAt()
        System.out.println("\nCharacter at index 3:");
        System.out.println(word.charAt(3));
        // substring()
        System.out.println("\nSubstring:");
        System.out.println(word.substring(0, 7));
        // contains()
        System.out.println("\nContains 'gram':");
        System.out.println(word.contains("gram"));
        // startsWith()
        System.out.println("\nStarts with 'Pro':");
        System.out.println(word.startsWith("Pro"));
        // endsWith()
        System.out.println("\nEnds with 'ing':");
        System.out.println(word.endsWith("ing"));
        // indexOf()
        System.out.println("\nFirst index of 'g':");
        System.out.println(word.indexOf('g'));
        // lastIndexOf()
        System.out.println("\nLast index of 'g':");
        System.out.println(word.lastIndexOf('g'));
        // replace()
        System.out.println("\nReplace:");
        System.out.println(word.replace("Programming", "Coding"));
        // concat()
        System.out.println("\nConcat:");
        System.out.println(word.concat(" Language"));
    }
}