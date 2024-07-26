import java.util.Scanner;

public class msteps1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("No of ways to reach top"+countWays(n,m));
    }
    public static int countWays(int n,int m){
        int dp[]=new int[n+1];
        dp[0]=0;dp[1]=1;dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=0;
            for(int j=1;j<=m && j<=i;j++){
                dp[i]=dp[i]+dp[i-j];
            }
        }
        return dp[n];
    }
}
