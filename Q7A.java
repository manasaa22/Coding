/*Program to print the initials of a name with the surname */
import java.util.Scanner;
public class Q7A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name =sc.nextLine();
        System.out.println("Name :"+conveString(name));
    }
    public static String conveString(String name){
        String s[]=name.split(" ");
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length-1;i++){
            String s2=s[i].toUpperCase();
            s1.append(s2.charAt(0));
            s1.append(".");
        }
        s1.append(s[s.length-1]);
        return s1.toString();
    }
}
