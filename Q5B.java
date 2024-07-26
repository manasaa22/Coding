import java.util.Scanner;

public class Q5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        String[] s = str.split(" ");
        String str1=toArray(s);
        String[] s1=str1.split("\n");
        String str2=toArray(s1);
        String[] s2=str1.split("\t");
        System.out.println("\nNumber of Words: " + s2.length);
    }
    public static String toArray(String s[]){
        StringBuilder result = new StringBuilder();
        for (String element : s) {
            result.append(element);
        }
        return result.toString();
    }
}
