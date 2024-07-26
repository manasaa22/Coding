import java.util.LinkedList;
import java.util.Scanner;

public class palindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it's a palindrome:");
        String input = sc.nextLine();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        System.out.println("Original LinkedList: " + list);
        boolean isPalindrome = checkPalindrome(list);
        System.out.println("Is the LinkedList a palindrome? " + isPalindrome);
        sc.close();
    }
    private static boolean checkPalindrome(LinkedList<Character> list) {
        int size = list.size();
        int mid = size / 2;
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = mid; i < size; i++) {
            stack.push(list.get(i));
        }
        for (int i = 0; i < mid; i++) {
            if (list.get(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
