/*A) Count of strings that does not contain any character of a given string */
import java.util.Scanner;
public class Q30A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.out.println("Enter String ");
        String s1=sc.nextLine();
        System.out.println("Count:"+containCharacter(s,s1));
    }
    public static int containCharacter(String []s,String str){
        int count=0;
        for(int i=0;i<s.length;i++){
            String s1=s[i];
            int f=0;
            for(int j=0;j<s1.length();j++){
                char c=s1.charAt(j);
                if(str.contains(str.valueOf(c))){
                    f=1;
                    break;
                }
            }
            if(f==0) count++;
        }
        return count;
    }
}
