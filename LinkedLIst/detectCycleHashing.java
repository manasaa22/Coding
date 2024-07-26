import java.util.HashSet;
import java.util.Scanner;

public class detectCycleHashing {
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

        boolean hasCycle = detectCycle(head);
        System.out.println("Does the LinkedList have a cycle? " + hasCycle);

        sc.close();
    }

    private static boolean detectCycle(Node head) {
        HashSet<Node> visitedNodes = new HashSet<>();

        while (head != null) {
            if (visitedNodes.contains(head)) {
                return true;
            }
            visitedNodes.add(head);
            head = head.next;
        }
        return false;
    }
}

