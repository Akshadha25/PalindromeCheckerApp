// Use Case 10: Case-Insensitive and Space-Ignored Palindrome Checker

public class UseCase10PalindromeCheckerApp {

    // Entry point of the application
    public static void main(String[] args) {

        System.out.println("Palindrome Checker Application - UC10");

        // Input text
        String text = "A man a plan a canal Panama";

        // Normalize the string
        String processed = text.replaceAll("\\s+", "").toLowerCase();

        // Convert to character array
        char[] arr = processed.toCharArray();

        // Two pointer comparison
        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The text \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}