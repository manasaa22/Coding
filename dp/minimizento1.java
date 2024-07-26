import java.util.Scanner;
public class minimizento1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("No of steps: "+minsteps(n));
    }
    public static int minsteps(int n){
        int maxi=Integer.MAX_VALUE;
        int dp[]=new int[n+1];
        dp[0]=0;dp[1]=0;dp[2]=1;dp[3]=1;
        for(int i=4;i<=n;i++){
            int x,y,z;
            x=dp[i-1];
            if(i%2==0){
                y=dp[i/2];
            }
            else
            y=maxi;
            if(i%3==0)
            z=dp[i/3];
            else
            z=maxi;
           // System.out.println(x+"     "+y+"     "+z+"i value"+i);
            dp[i]=Math.min(x,Math.min(y,z))+1;
            //System.out.println(dp[i]);
        }
        return dp[n];
    }
}
