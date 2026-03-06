
// Use Case 9: Recursive Palindrome Checker

public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean checkPalindrome(String word, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call moving towards center
        return checkPalindrome(word, start + 1, end - 1);
    }

    // Entry point of the program
    public static void main(String[] args) {

        System.out.println("Palindrome Checker Application - UC9");

        // Input string
        String word = "racecar";

        // Call recursive method
        boolean result = checkPalindrome(word, 0, word.length() - 1);

        // Display result
        if (result) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}