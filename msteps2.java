import java.util.Scanner;
public class msteps2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("No of ways to reach top: "+countWays(n,m));
    }
    
    public static int countWays(int n, int m){
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i <= m && i <= n; i++)
            res += countWays(n-i, m);
        return res;
    }
}
