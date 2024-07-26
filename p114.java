/*Encryption  of String according to given technique
Given a string S, the task is to encrypt the string
Encryption Technique: If L is the length of the string, then take two values, one the ceil of ?L (say b),
and the other floor of ?L (say a), and make a two-dimensional matrix having rows = a, and columns = b.
If rows*columns < L, then increase the value of a or b, whichever is minimum.
Fill the matrix with the characters of the original string sequentially. After obtaining the matrix, read the matrix
column-wise and print the obtained string. */
import java.util.Scanner;
public class p114 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String e=encString(s);
        System.out.println("Encrypted String  :  "+e);
        System.out.println("Decryptrd String  :  "+decryptedStr(e));
    }
    public static String encString(String s){
        int n=s.length();
        int b=(int)Math.ceil(Math.sqrt(n));
        int a=(int)Math.floor(Math.sqrt(n));
        while(a*b<n){
            if(Math.min(a, b)==b)
            b=b+1;
            else
            a=a+1;
        }
        char[][] c=new char[a][b];
        int k=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(k<n){
                    c[i][j]=s.charAt(k++);
                }
            }
        }
        String e="";
        for (int j = 0; j < b; j++){
        for (int i = 0; i < a; i++)
        {
            e=e+c[i][j];
        }
    }
    return e;
    }
    public static String decryptedStr(String s){
        int n=s.length();
        int b=(int)Math.ceil(Math.sqrt(n));
        int a=(int)Math.floor(Math.sqrt(n));
        while(a*b<n){
            if(Math.min(a, b)==b)
            b=b+1;
            else
            a=a+1;
        }
        char[][] c=new char[a][b];
        int k=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(k<n){
                    c[i][j]=s.charAt(k++);
                }
            }
        }
        String d="";
        for (int j = 0; j < a; j++){
        for (int i = 0; i < b; i++)
        {
            d=d+c[i][j];
        }
    }
    return d;
    }
}
