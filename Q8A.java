import java.util.HashMap;
import java.util.Scanner;

public class Q8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (frequencyChar(s1, s2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean frequencyChar(String s1, String s2) {
        HashMap<Character, Integer> hp = new HashMap<>();
        HashMap<Character, Integer> hp2 = new HashMap<>();

        for (char c : s1.toCharArray())
            hp.put(c, hp.getOrDefault(c, 0) + 1);

        for (char c : s2.toCharArray())
            hp2.put(c, hp2.getOrDefault(c, 0) + 1);

        for (char key : hp.keySet()) {
            int frequency1 = hp.get(key);
            int frequency2 = hp2.getOrDefault(key, 0);

            if (frequency1 != 0 && frequency2 != 0 && (frequency2 % frequency1 != 0) && (frequency1 % frequency2 != 0)) {
                return false;
            }
        }
        return true;
    }
}
