import java.util.Scanner;
public class StringAnalyzer {
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
    static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    static boolean isPalindrome(String str) {
        String cleaned = str.replace(" ", "");
        String reversed = reverse(cleaned);
        return cleaned.equalsIgnoreCase(reversed);
    }
    static String removeSpaces(String str) {
        return str.replace(" ", "");
    }
    static int countWords(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        String[] words =
            str.split("\\s+");
        return words.length;
    }
    static String findLongestWord(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return "";
        }
        String[] words =
            str.split("\\s+");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    static char firstNonRepeatingCharacter(
        String str
    ) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                return current;
            }
        }
        return '\0';
    }
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
        Scanner sc = new Scanner(System.in);
        System.out.println("STRING ANALYZER");
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        System.out.println("ANALYSIS");
        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Vowels: " + countVowels(text));
        System.out.println("Consonants: " + countConsonants(text));
        System.out.println("Digits: " + countDigits(text));
        System.out.println("Spaces: " + countSpaces(text));
        System.out.println("Words: " + countWords(text));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Reversed: " + reverse(text));
        System.out.println("Without Spaces: " +removeSpaces(text));
        System.out.println("Vowels Replaced: " +replaceVowels(text));
        System.out.println("Longest Word: " +findLongestWord(text));
        System.out.println("Palindrome: " +isPalindrome(text));
        char firstUnique = firstNonRepeatingCharacter(removeSpaces(text));
        if (firstUnique != '\0') {
            System.out.println("First Non-Repeating Character: " +firstUnique);
        } else {
            System.out.println("First Non-Repeating Character: None");
        }
        sc.close();
    }
}