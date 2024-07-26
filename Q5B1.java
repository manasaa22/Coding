import java.util.Scanner;
public class Q5B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("\nNumber of Words: " +countWords(str));
    }
    public static int countWords(String str)
    {
            if (str == null || str.isEmpty())
            return 0;
        String[] words = str.split("\\s+");
            return words.length;
    }
}
