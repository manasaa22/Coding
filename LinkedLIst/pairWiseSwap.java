import java.util.LinkedList;
import java.util.Scanner;

public class pairWiseSwap {
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
        pairwiseSwap(list);
        System.out.println("LinkedList after pairwise swapping: " + list);

        sc.close();
    }

    private static void pairwiseSwap(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            // Swap the current element with the next element
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}
