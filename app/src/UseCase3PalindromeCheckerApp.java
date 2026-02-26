// Use Case 3: Palindrome Check Using String Reverse

public class UseCase3PalindromeCheckerApp {

    // Entry point of the program
    public static void main(String[] args) {

        // Display application title
        System.out.println("Palindrome Checker Application - UC3");

        // Declare and initialize the string
        String word = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed strings using equals()
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Indicate program completion
        System.out.println("Program executed successfully.");
    }
}