// Use Case 8: Linked List Based Palindrome Checker

public class UseCase8PalindromeCheckerApp {

    // Node class representing each element in the linked list
    static class Node {
        char data;   // stores character
        Node next;   // reference to next node

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Entry point of the application
    public static void main(String[] args) {

        System.out.println("Palindrome Checker Application - UC8");

        // String to check
        String word = "madam";

        // Creating linked list from string characters
        Node head = null;
        Node tail = null;

        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Call method to verify palindrome
        boolean result = checkPalindrome(head);

        // Display result
        if (result) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }

    // Method that checks if linked list represents a palindrome
    public static boolean checkPalindrome(Node head) {

        // If list has 0 or 1 node it is automatically a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Using fast and slow pointers to locate middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half of list
        Node secondHalf = reverseList(slow.next);

        Node firstHalf = head;

        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Method to reverse a linked list
    public static Node reverseList(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}