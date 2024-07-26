import java.util.LinkedList;
import java.util.Scanner;
public class recursiveSearch {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the LinkedList:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element to search:");
        int searchElement = sc.nextInt();
        boolean found = recursiveSearch(list, searchElement);
        if (found) {
            System.out.println("Element " + searchElement + " found in the LinkedList.");
        } else {
            System.out.println("Element " + searchElement + " not found in the LinkedList.");
        }
        sc.close();
    }
    private static boolean recursiveSearch(LinkedList<Integer> list, int searchElement) {
        return recursiveSearchHelper(list, searchElement, 0);
    }
    private static boolean recursiveSearchHelper(LinkedList<Integer> list, int searchElement, int index) {
        if (index == list.size()) {
            return false;
        }
        if (list.get(index) == searchElement) {
            return true;
        }
        //Recursive Call
        return recursiveSearchHelper(list, searchElement, index + 1);
    }
}
