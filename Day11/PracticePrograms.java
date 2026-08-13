import java.util.Scanner;
public class PracticePrograms {
    // 1. Count Vowels
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
    // 2. Count Consonants
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
    // 3. Count Digits
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
    // 4. Count Spaces
    static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    // 5. Reverse String
    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    // 6. Palindrome
    static boolean isPalindrome(String str) {
        String cleaned = str.replace(" ", "");
        String reversed = reverse(cleaned);
        return cleaned.equalsIgnoreCase(reversed);
    }
    // 7. Character Frequency
    static int characterFrequency(
            String str,
            char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    // 8. Remove Spaces
    static String removeSpaces(String str) {
        return str.replace(" ", "");
    }
    // 9. Replace Vowels
    static String replaceVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result.append('*');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    // 10. Count Words
    static int countWords(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
    // 11. Find Longest Word
    static String longestWord(String str) {
        String[] words = str.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    // 12. Check Anagram
    static boolean areAnagrams(String first,String second) {
        first = removeSpaces(first).toLowerCase();
        second = removeSpaces(second).toLowerCase();
        if (first.length() != second.length()) {
            return false;
        }
        int[] frequency = new int[256];
        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }
        for (int value : frequency) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
    // 13. First Non-Repeating Character
    static char firstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }
            if (count == 1) {
                return current;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = sc.nextLine();
        // Basic Information
        System.out.println("\n========== STRING ANALYSIS ==========");
        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Vowels: " + countVowels(text));
        System.out.println("Consonants: " + countConsonants(text));
        System.out.println("Digits: " + countDigits(text));
        System.out.println("Spaces: " + countSpaces(text));
        // Case Conversion
        System.out.println("\nUppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        // Reverse
        System.out.println("\nReversed: " + reverse(text));
        // Palindrome
        System.out.println("Palindrome: " + isPalindrome(text));
        // Remove Spaces
        System.out.println("Without Spaces: " + removeSpaces(text));
        // Replace Vowels
        System.out.println("Vowels Replaced: " + replaceVowels(text));
        // Word Count
        System.out.println("Word Count: " + countWords(text));
        // Longest Word
        System.out.println("Longest Word: " + longestWord(text));
        // Character Frequency
        System.out.println("\nEnter character to find frequency: ");
        char target = sc.nextLine().charAt(0);
        System.out.println("Frequency of '" + target + "': " + characterFrequency(text, target));
        // First Non-Repeating Character
        char firstUnique = firstNonRepeatingCharacter(text);
        if (firstUnique != '\0') {
            System.out.println("First Non-Repeating Character: " + firstUnique);
        } else {
            System.out.println("No non-repeating character found.");
        }
        // Anagram Test
        System.out.print("\nEnter another String for Anagram Check: ");
        String second = sc.nextLine();
        System.out.println("Are Anagrams: " + areAnagrams(text, second));
        sc.close();
    }
}