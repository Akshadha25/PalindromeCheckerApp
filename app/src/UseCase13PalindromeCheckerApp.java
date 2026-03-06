import java.util.*;

public class UseCase13PalindromeCheckerApp {

    /* Stack based palindrome */
    static boolean stackPalindrome(String input) {

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

    /* Deque based palindrome */
    static boolean dequePalindrome(String input) {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.println("\nPerformance Comparison");

        long start, end;

        /* Stack Algorithm Timing */
        start = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        end = System.nanoTime();
        long stackTime = end - start;

        /* Deque Algorithm Timing */
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("\nAlgorithm | Result | Time (ns)");
        System.out.println("--------------------------------");

        System.out.println("Stack     | " + stackResult + " | " + stackTime);
        System.out.println("Deque     | " + dequeResult + " | " + dequeTime);

        scanner.close();
    }
}