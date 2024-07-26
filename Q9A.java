import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isPangram(s)) {
            System.out.println(s + " is a pangram");
        } else {
            System.out.println(s + " is not a pangram");
        }
    }

    public static boolean isPangram(String s) {
        Set<Character> charSet = new HashSet<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        return charSet.size() == 26;
    }
}
