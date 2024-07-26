import java.util.Scanner;
public class stairs32 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("No of ways to reach top"+countWays(n));
    }
    public static int countWays(int n){
        int dp[]=new int[n];
        dp[0]=1;dp[1]=2;dp[2]=4;
        for(int i=3;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n-1];
    }
}
