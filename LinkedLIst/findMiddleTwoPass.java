import java.util.LinkedList;
import java.util.Scanner;
public class findMiddleTwoPass {
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
        // First pass: count the total number of elements
        int totalElements = list.size();
        // Second pass: find the middle element
        int middleIndex = totalElements / 2;
        int currentIndex = 0;
        for (Integer element : list) {
            if (currentIndex == middleIndex) {
                return element; // Found the middle element
            }
            currentIndex++;
        }
        return -1; // Should not reach here if the list is not empty
    }
}

