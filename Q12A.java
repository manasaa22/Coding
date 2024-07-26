/*A) Given an array of words and a string, we need to count all words that are present in given string.  */
import java.util.Scanner;
public class Q12A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter number");
        int n=sc.nextInt();
        int c=0;
        String words[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
        }
        String s=sc.nextLine();
        for(int i=0;i<words.length;i++){
            if(s.contains(words[i])){
                //System.err.println(words[i]);
                c++;
            }
        }
        System.err.println("Count:"+c);
    }
}
