import java.util.Arrays;
import java.util.Scanner;

public class countOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter time");
        int T=sc.nextInt();
        System.out.println("Count of operations: " + countTasks(a,T,n));
    }
    public static int countTasks(int a[],int t,int n){
        int c=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            t=t-a[i];c++;
            if(t==0)
            return c;
            else if(t<0)
            return c-1;
        }
        return -1;
    }
}
