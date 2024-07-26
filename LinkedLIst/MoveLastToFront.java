import java.util.LinkedList;
import java.util.Scanner;

public class MoveLastToFront {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the LinkedList:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original LinkedList: " + list);
        moveLastToFront(list);
        System.out.println("LinkedList after moving the last element to the front: " + list);

        sc.close();
    }

    private static void moveLastToFront(LinkedList<Integer> list) {
        // Check if the list is empty or has only one element
        if (list.isEmpty() || list.size() == 1) {
            return;
        }

        int lastIndex = list.size() - 1;
        int lastElement = list.removeLast(); // Remove and get the last element

        // Add the last element to the front of the list
        list.addFirst(lastElement);
    }
}

