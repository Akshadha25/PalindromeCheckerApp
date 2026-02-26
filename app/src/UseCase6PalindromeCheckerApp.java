// Use Case 6: Queue + Stack Based Palindrome Check

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    // Entry point of the program
    public static void main(String[] args) {

        // Display application title
        System.out.println("Palindrome Checker Application - UC6");

        // Declare and initialize the string
        String word = "madam";

        // Create Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both data structures
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // Enqueue operation
            stack.push(ch);  // Push operation
        }

        // Variable to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue (FIFO) and pop (LIFO)
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue operation
            char fromStack = stack.pop();    // Pop operation

            if (fromQueue != fromStack) {
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