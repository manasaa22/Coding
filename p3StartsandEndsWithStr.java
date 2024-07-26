/*Find if a string starts and ends with another given string
Given a string str and a corner string cs, we need to find out whether the string str starts
and ends with the corner string cs or not.
Examples:

Input : str = "geeksmanishgeeks", cs = "geeks"
Output : Yes

Input : str = "shreya dhatwalia", cs = "abc"
Output : No */
import java.util.Scanner;
public class p3StartsandEndsWithStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s1=sc.nextLine();
        System.out.println("Enter SubString");
        String s2=sc.nextLine();
        System.out.println(startsAndEndsWithString(s1,s2));
    }
    public static String startsAndEndsWithString(String s,String sub){
        // Check if the string is null or length of substring is greater than string
        if (sub == null || s.length() < sub.length()) return "No";
        int start = 0;
        int end = s.length() - 1;
        if(s.endsWith(sub)||s.startsWith(sub))
        return "YES";
        else
        return "No";
    }
}
