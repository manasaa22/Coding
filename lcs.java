import java.util.Arrays;
import java.util.Scanner;
public class lcs {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        int m=s1.length();
        int n=s2.length();
        lcs2(s1,s2,m,n);
    }
    public static void lcs2(String x , String y , int m ,int n ) {
        int dp[][]=new int[m+1][n+1];
        for (int[] r: dp) {
            Arrays.fill(r, 0);
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1;
                else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println("Length of LCS is "+dp[m][n]);
        StringBuilder sb=new StringBuilder();
        String lsc;int i=m,j=n;
        while(i>0 && j>0){
            if(x.charAt(i-1) ==y.charAt(j-1)){
                sb.append(x.charAt(i-1));
                i--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }
                else
                j--;
                }
        }
        lsc=sb.reverse().toString();
        System.out.print("Longest Common Subsequence is :"+lsc);
    }

}
