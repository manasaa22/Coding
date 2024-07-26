import java.util.Scanner;
public class maxProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Maximum Profit is : "+maxprofit1(a,n));
    }
    //Method to calculate maximum profit using greedy algorithm
    public static int maxprofit1(int arr[], int n){
        int maxsofar=0,m=0;
        for(int i=n-1;i>0;i--){
            maxsofar=Math.max(maxsofar,arr[i]);
            m=Math.max(m,maxsofar-arr[i]);
        }
        return m;
    }
}
