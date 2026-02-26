// Use Case 4: Character Array Based Palindrome Check

public class UseCase4PalindromeCheckerApp {

    // Entry point of the program
    public static void main(String[] args) {

        // Display application title
        System.out.println("Palindrome Checker Application - UC4");

        // Declare and initialize the string
        String word = "radar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        // Variable to track palindrome status
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            // Compare characters at start and end
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            // Move pointers
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Indicate program completion
        System.out.println("Program executed successfully.");
    }
}
