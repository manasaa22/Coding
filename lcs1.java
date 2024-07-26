import java.util.Scanner;
public class lcs1 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        int m=s1.length();
        int n=s2.length();
        System.out.println("Length of Longest common subsequence: " +lcs2(s1,s2,m,n));
    }
    public static int lcs2(String x,String y,int m,int n){
        if(m==0||n==0)
        return 0;
        if(x.charAt(m-1)==y.charAt(n-1)){
            return  lcs2(x,y,m-1,n-1)+1;
        }
        else{
            int a=lcs2(x,y,m-1,n);
            int b=lcs2(x,y,m,n-1);
            return Math.max(a, b);
        }
    }
}
