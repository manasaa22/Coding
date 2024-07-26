
import java.util.Scanner;
public class maxSum {
    public static void main(String []strgs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum:"+maxS(arr,n));
    }
    public static int maxS(int a[],int n){
        int cmax=a[0],maxi=a[0];
        for(int i=1;i<n;i++){
            int s=a[i]+cmax;
            cmax=Math.max(cmax,s);
            maxi=Math.max(maxi,cmax);
        }
        return maxi;
    }
}

