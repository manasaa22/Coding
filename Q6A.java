/*A)	Find one extra character in a string */
import java.util.Scanner;
public class Q6A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n = s1.length(), m = s2.length();
        for(int i=0;i<m;i++){
            char c=s2.charAt(i);
            if(s1.contains(s1.valueOf(c))){
                continue;
            }
            else
            System.out.println("The extra character is "+c);
        }
    }
}
