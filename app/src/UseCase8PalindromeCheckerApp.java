// Use Case 8: Linked List Based Palindrome Checker
// Goal: Check if a word is a palindrome using a singly linked list

public class UseCase8PalindromeCheckerApp {

    // Node class representing each element of the linked list
    static class Node {
        char data;   // stores character data
        Node next;   // reference to next node

        // Constructor to create a new node
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Entry point of the program
    public static void main(String[] args) {

        System.out.println("Palindrome Checker Application - UC8");

        // Word to be checked
        String word = "madam";

        // Head and tail references for linked list
        Node head = null;
        Node tail = null;

        // Convert the string into a singly linked list
        for (int i = 0; i < word.length(); i++) {

            // Create a new node for each character
            Node newNode = new Node(word.charAt(i));

            // If list is empty initialize head and tail
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            // Otherwise attach node to the end of the list
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Call method to check if linked list represents a palindrome
        boolean isPalindrome = checkPalindrome(head);

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }

    // Method to check palindrome using linked list
    public static boolean checkPalindrome(Node head) {

        // If list has 0 or 1 element it is a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Fast and slow pointer technique to find the middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node secondHalf = reverseList(slow.next);

        Node firstHalf = head;

        // Compare first half and reversed second half
        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // If all characters match it is a palindrome
        return true;
    }

    // Method to reverse a singly linked list
    public static Node reverseList(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        // Reverse links between nodes
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Return new head of reversed list
        return prev;
    }
}