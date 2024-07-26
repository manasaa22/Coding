import java.util.Arrays;
import java.util.Scanner;

public class makeArrayEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("No of Steps to make an array equal "+countSteps(a,n));
    }
    public static int countSteps(int a[],int n){
        Arrays.sort(a);
        int c=0;int mid=n/2;
        for(int i=0;i<n;i++){
            c+=Math.abs(a[i]-a[mid]);
        }
        return c;
    }
}
