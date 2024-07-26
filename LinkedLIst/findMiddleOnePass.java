import java.util.LinkedList;
import java.util.Scanner;

public class findMiddleOnePass {
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
        int middleElement = findMiddle(list);
        System.out.println("Middle Element: " + middleElement);

        sc.close();
    }

    private static int findMiddle(LinkedList<Integer> list) {
        // Check if the list is empty
        if (list.isEmpty()) {
            System.out.println("LinkedList is empty.");
            return -1;
        }

        // Initialize two pointers
        int slowPointer = 0;
        int fastPointer = 0;

        // Move the pointers until the fast pointer reaches the end of the list
        while (fastPointer < list.size() && fastPointer + 1 < list.size()) {
            slowPointer++;          // Move slow pointer one node at a time
            fastPointer += 2;       // Move fast pointer two nodes at a time
        }

        // The slow pointer is now at the middle position
        return list.get(slowPointer);
    }
}
