import java.util.Scanner;

public class detectCycleFloyd {
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

        // Create a cycle for testing (comment this part for a cycle-free list)
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = head.next;

        boolean hasCycle = detectCycle(head);
        System.out.println("Does the LinkedList have a cycle? " + hasCycle);

        sc.close();
    }

    private static boolean detectCycle(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            // If the pointers meet, there is a cycle
            if (slowPointer == fastPointer) {
                return true;
            }
        }

        // No cycle found
        return false;
    }
}
