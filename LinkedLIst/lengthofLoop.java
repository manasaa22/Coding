import java.util.HashSet;
import java.util.Scanner;

public class lengthofLoop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the LinkedList:");
        int n = sc.nextInt();

        Node head = null;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Create a loop for testing (comment this part for a loop-free list)
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = head.next;

        int loopLength = findLoopLengthUsingHashing(head);
        System.out.println("Length of the loop (Using Hashing): " + loopLength);

        sc.close();
    }

    private static int findLoopLengthUsingHashing(Node head) {
        HashSet<Node> visitedNodes = new HashSet<>();
        int length = 0;

        while (head != null) {
            if (visitedNodes.contains(head)) {
                // Loop found, calculate the length
                return length - visitedNodes.size();
            }

            visitedNodes.add(head);
            head = head.next;
            length++;
        }

        // No loop found
        return 0;
    }
}

