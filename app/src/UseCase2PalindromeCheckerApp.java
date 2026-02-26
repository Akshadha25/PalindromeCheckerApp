// Use Case 2: Print Palindrome Result

public class UseCase2PalindromeCheckerApp {

    // Main method - Entry point of the program
    public static void main(String[] args) {

        // Display application title
        System.out.println("Palindrome Checker Application");

        // Declare and initialize a string value
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Loop to reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional statement to check palindrome condition
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Indicate program completion
        System.out.println("Program executed successfully.");
    }
}