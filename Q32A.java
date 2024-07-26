/*A) Most similar string

Given a string str and an array of strings arr[] of size N, the task is to print a string from arr[], which has maximum count of matching characters with str.
*/
import java.util.Scanner;
public class Q32A {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter number");
        int n=sc.nextInt();
        sc.nextLine();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        System.out.println("Most similar string:"+mostsimilars(str,s));
    }
    public static String mostsimilars(String []a,String s){
        int max=Integer.MIN_VALUE;
        String maxc="";
        for(int i=0;i<a.length;i++){
            int count=getsimilarCount(a[i],s);
            if(max<count){
                max=count;
                maxc=a[i];
            }
        }
        return maxc;
    }
    public static int getsimilarCount(String s1,String s2){
        int c=0;
        for(int i=0;i<s2.length();i++){
            char c1=s2.charAt(i);
            if(s1.contains(String.valueOf(c1))){
                c++;
            }
        }
        //System.out.println(s1+"  "+c);
        return c;
    }
}
