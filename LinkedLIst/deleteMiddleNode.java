import java.util.LinkedList;
import java.util.Scanner;
public class deleteMiddleNode {
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
        LinkedList<Integer> listTwoPass = new LinkedList<>(list);
        deleteMiddleTwoPass(listTwoPass);
        System.out.println("LinkedList after deleting middle node (Two Pass): " + listTwoPass);
        LinkedList<Integer> listOnePass = new LinkedList<>(list);
        deleteMiddleOnePass(listOnePass);
        System.out.println("LinkedList after deleting middle node (One Pass): " + listOnePass);

        sc.close();
    }
    private static void deleteMiddleTwoPass(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("LinkedList is empty.");
            return;
        }
        int totalElements = list.size();
        int middleIndex = totalElements / 2;
        list.remove(middleIndex);
    }
    private static void deleteMiddleOnePass(LinkedList<Integer> list) {
        if (list.isEmpty() || list.size() == 1) {
            System.out.println("Cannot delete middle node. LinkedList is empty or has only one element.");
            return;
        }
        int slowPointer = 0;
        int fastPointer = 0;
        while (fastPointer < list.size() && fastPointer + 1 < list.size()) {
            slowPointer++;          
            fastPointer += 2;
        }
        list.remove(slowPointer);
    }
}
