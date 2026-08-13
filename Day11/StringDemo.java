public class StringDemo {
    public static void main(String[] args) {
        // String literal
        String language = "Java";
        // String using new keyword
        String course = new String("DSA");
        System.out.println("Language: " + language);
        System.out.println("Course: " + course);
        // String length
        System.out.println("\nLength of language: " + language.length());
        // Accessing characters
        System.out.println("\nCharacters:");
        for (int i = 0; i < language.length(); i++) {
            System.out.println("Index " + i + " = " + language.charAt(i));
        }
        // Concatenation
        String message = language + " " + course;
        System.out.println("\nConcatenated String:");
        System.out.println(message);
        // String immutability
        String name = "Java";
        name.concat(" Programming");
        System.out.println("\nAfter concat without assignment:");
        System.out.println(name);
        // Correct way
        name = name.concat(" Programming");
        System.out.println("\nAfter concat with assignment:");
        System.out.println(name);
    }
}