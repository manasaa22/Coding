/*B)	Given marks of N students sitting on a bench and a value of K, print the index of the student whose marks matches with the value of K. */
import java.util.Scanner;
public class Q8B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter k value");
        int k=sc.nextInt();
        int ans=0;
        int low=0,high=n-1;
        boolean flag=false;
        while(!flag){
            int mid=(low+high)/2;
            if(k==a[mid]){
                ans=mid;
                flag=true;
            }
            if(k<a[mid]){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        System.out.println("The first element greater than or equal to "+k+" is at index: "+(ans));
    }
}
