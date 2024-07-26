/*Encrypt a string by repeating i-th character i times */
import java.util.Scanner;
public class Q19B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=encryptString(s);
        System.out.println(s1);
    }
    public static String encryptString(String s){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<i+1;j++){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
