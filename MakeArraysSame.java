import java.util.Arrays;
import java.util.Scanner;
public class MakeArraysSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
        System.out.println("Count to make 2 arrays as same  "+minSteps(a,b,n));
    }
    public static int minSteps(int a[],int b[],int n){
        Arrays.sort(a);
        Arrays.sort(b);int r=0;
        for(int i=0;i<n;i++){
            if(a[i]>b[i]) r=r+(a[i]-b[i]);
            else
            r=r+(b[i]-a[i]);
        }
        return r;
    }
}
