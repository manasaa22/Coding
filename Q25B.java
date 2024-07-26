import java.util.Scanner;

public class Q25B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Given String" + s);

        String reversedVowels = reverseVowels(s);
        
        System.out.println("Output str:" + reversedVowels);
    }

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(c[left])) {
                left++;
            }
            while (left < right && !isVowel(c[right])) {
                right--;
            }
            if (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                System.out.println(c[left]+"   "+c[right]);
                left++;
                right--;
            }
        }
        return new String(c);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
