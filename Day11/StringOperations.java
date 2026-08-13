public class StringOperations {
    // Count vowels
    static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    // Count consonants
    static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }
    // Count digits
    static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        return count;
    }
    // Count spaces
    static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }
    // Reverse String
    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    // Check palindrome
    static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }
    // Count a specific character
    static int countCharacter(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    // Remove spaces
    static String removeSpaces(String str) {
        return str.replace(" ", "");
    }
    // Convert vowels to *
    static String replaceVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result.append('*');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String text = "Java Programming 123";
        System.out.println("Original String:");
        System.out.println(text);
        System.out.println("\nVowels: " + countVowels(text));
        System.out.println("Consonants: " + countConsonants(text));
        System.out.println("Digits: " + countDigits(text));
        System.out.println("Spaces: " + countSpaces(text));
        System.out.println("Reversed: " + reverse(text));
        System.out.println("Palindrome: " + isPalindrome(text));
        System.out.println("Frequency of 'a': " + countCharacter(text, 'a'));
        System.out.println("Without Spaces: " + removeSpaces(text));
        System.out.println("Vowels Replaced: " + replaceVowels(text));
    }
}