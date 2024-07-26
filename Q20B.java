/*B) Check if String formed by first and last X characters of a String is a Palindrome */
import java.util.Scanner;
public class Q20B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int x=sc.nextInt();
        if(isPalindrome(s,x)){
            System.err.println("True");
        }
        else{
            System.err.println("False");
        }
    }
    public static boolean isPalindrome(String s,int x){
        int n=s.length();
        for(int i=1;i<=x;i++){
            char c1=s.charAt(i-1);
            //System.out.println(s.charAt(i-1)+"   "+s.charAt(n-i));
            if(s.charAt(i-1)!=(s.charAt(n-i))){
                return false;
            }
        }
        return true;
    }
}
