/*A)Find resultant string after concatenating uncommon characters of given strings */
import java.util.Scanner;
public class Q15A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int l1 =s1.length();
        String s2=sc.nextLine();
        int l2 = s2.length();
        StringBuilder s=new StringBuilder();
        for (int i = 0; i <l1 ; i++) {
            char c1=s1.charAt(i);
            if(!s2.contains(String.valueOf(c1))){
                s.append(c1);
            }
        }
        for (int i = 0; i <l2; i++) {
            char c1=s2.charAt(i);
            if(!s1.contains(String.valueOf(c1))){
                s.append(c1);
            }
        }
        System.out.println("Resultant string is : "+s.toString());
    }
}
