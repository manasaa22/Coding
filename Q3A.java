/* A)	Removing punctuations from a given string*/
import java.util.Scanner;
public class Q3A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        //To remove all special characters and digits
        String s1=" ";
        for (int i = 0; i < s.length(); i++) {
            if (((int)s.charAt(i))>=65 && ((int)s.charAt(i))<=122){
            s1+=s.charAt(i);
            }
            else
            continue;
        }
        System.out.println("The Given String After Removing Punctuation is:"+s1.toString());
        
    }
}
