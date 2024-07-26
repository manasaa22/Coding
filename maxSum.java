import java.util.PriorityQueue;
import java.util.Scanner;
public class maxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter partition");
        int k=sc.nextInt();
        System.out.println("The maximum sum is "+maxArraySum(arr,k));
    }
    public static int maxArraySum(int a[],int k){
        int n=a.length;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            p.add(a[i]);
        }
        for(int i=0;i<k;i++){
            int x=p.poll();
            x=-x;
            p.add(x);
        }
        int s=0;
        while(p.size()>1){
            int x=p.poll();
            s=s+x;
        }
        return s+p.peek();
    }
}
