import java.util.Arrays;
import java.util.Scanner;

public class productOfThreeEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("The maximum product of 3 elements among given array: "+ productOf(a,n));
    }
    public static int productOf(int a[],int n){
        Arrays.sort(a);
        int x=a[n-1]*a[n-2]*a[n-3];
        int y=a[n-1]*a[0]*a[1];
        return Math.max(x,y);
    }
}
