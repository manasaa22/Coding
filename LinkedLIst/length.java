import java.util.LinkedList;
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the LinkedList:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int length = iLength(list);
        System.out.println("Length of the LinkedList: " + length);
        sc.close();
    }
    private static int iLength(LinkedList<Integer> list) {
        int count = 0;
        for (Integer a: list) {
            count++;
        }
        return count;
    }
}
