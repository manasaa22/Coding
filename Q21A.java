/*Check if array elements are consecutive.        */
import java.util.Scanner;
public class Q21A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(isConsecutive(a))
        System.out.println("True");
        else
        System.out.println("False");
    }
    public static boolean isConsecutive(int a[]){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
            s=s+a[i];
        }
        int m=naturalsum(max);
        int n=naturalsum(min);
        //System.out.println(s+" "+m+" "+n);
        if(min==1){
            if(s==m) return true;
        }
        if(s==(m-n))
        return true;
        else
        return false;
    }
    public static int naturalsum(int n){
        return n*(n+1)/2;
    }
}
