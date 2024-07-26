import java.util.Scanner;
public class maximumProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit is : "+maxProfit(prices,n));
    }
    public static int maxProfit(int a[],int n){
        int maxsofar=0,s=0;
        for (int i = n-1; i >=0; i--) {
            maxsofar=Math.max(maxsofar,a[i]);
            s=s+Math.abs(maxsofar-a[i]);
            //System.out.println(maxsofar+"   "+s+"   "+a[i]);
        }
        return s;
    }
}
