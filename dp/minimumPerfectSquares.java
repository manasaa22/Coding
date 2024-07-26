import java.util.Scanner;

public class minimumPerfectSquares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Minimum no of perfect squares:"+minimumperfecrSquares(num));
    }
    public static int minimumperfecrSquares(int n){
          int[] dp = new int[n + 1];int mini=Integer.MAX_VALUE;
          for(int i=0;i<n+1;i++){
            dp[i]=i;
          }
          for(int i=4;i<=n;i++){
            for(int j=0;j<Math.ceil(Math.sqrt(i));j++){
                int temp=(j+1)*(j+1);
                if(dp[i]<temp)break;
                mini=Math.min(dp[i],1+dp[i-temp]);
            }
          }
          return dp[n];
    }
}

