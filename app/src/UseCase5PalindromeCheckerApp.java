// Use Case 5: Stack-Based Palindrome Checker

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    // Entry point of the program
    public static void main(String[] args) {

        // Display application title
        System.out.println("Palindrome Checker Application - UC5");

        // Declare and initialize the string
        String word = "madam";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Variable to track palindrome status
        boolean isPalindrome = true;

        // Pop characters from stack and compare with original string
        for (int i = 0; i < word.length(); i++) {
            char poppedChar = stack.pop();

            if (word.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
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