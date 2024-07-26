import java.util.Arrays;
import java.util.Scanner;
public class lis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("LIS:  "+lis_length(a,n));
    }
    public static int lis_length(int a[],int n){
        if(n==1) return 1;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(a[i]>a[j])
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        return dp[n-1];
    }
}
