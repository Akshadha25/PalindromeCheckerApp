import java.util.Scanner;

class PalindromeChecker {

    // Encapsulated palindrome logic
    public boolean checkPalindrome(String input) {

        if (input == null) return false;

        // Remove spaces and convert to lowercase (case insensitive)
        String str = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Internal array-style traversal logic
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Palindrome Status: " + result);

        scanner.close();
    }
}