import java.util.Scanner;

public class lengthofLoopFloyd {
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
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = head.next;

        int loopLength = findLoopLengthUsingFloyd(head);
        System.out.println("Length of the loop (Using Floyd): " + loopLength);

        sc.close();
    }

    private static int findLoopLengthUsingFloyd(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;
        boolean isLoop = false;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                isLoop = true;
                break;
            }
        }

        if (isLoop) {
            int length = 1;
            fastPointer = fastPointer.next;
            while (slowPointer != fastPointer) {
                fastPointer = fastPointer.next;
                length++;
            }
            return length;
        }
        return 0;
    }
}

