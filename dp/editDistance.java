import java.util.Scanner;
public class editDistance {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter strings");
        s1=sc.nextLine();
        s2=sc.nextLine();
        int m = s1.length(), n = s2.length();
        System.out.println("Minimum dist to convert s1 to s2   :"+dist(s1,s2,m,n));
    }
    public static int dist(String s1,String s2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
            //System.out.println(i);
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                //System.out.println(dp[i][j]);
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
                //System.out.println(dp[i][j]);
            }
        }
        return dp[m][n];
    }
}
