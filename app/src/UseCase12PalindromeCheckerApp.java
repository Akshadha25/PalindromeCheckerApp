import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/* Stack Strategy */
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return input.equals(reversed.toString());
    }
}

/* Deque Strategy */
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

/* Main Application */
public class UseCase12PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.checkPalindrome(input);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UseCase12PalindromeCheckerApp app = new UseCase12PalindromeCheckerApp();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (choice == 1) {
            app.setStrategy(new StackStrategy());
        } else {
            app.setStrategy(new DequeStrategy());
        }

        boolean result = app.executeStrategy(input);

        System.out.println("Palindrome Status: " + result);

        scanner.close();
    }
}