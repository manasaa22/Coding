/* A)	Check Whether a number is Duck Number or not */
import java.util.Scanner;
public class Q2A {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        System.out.println(s);
        if(!s.contains("0"))
        {
            System.out.println("The given number is not a Duck number");
        }
        else{
            System.err.println("Given number a Duck number");
        }
    }
}
