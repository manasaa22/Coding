import java.util.Arrays;
import java.util.Scanner;
public class findShelter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n =sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("Min time to place all in diff shelters: "+find(a,b,n));
    }
    public static int find(int  a[],int b[],int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int res=0;
        for(int i=0;i<n;i++){
            int c=Math.abs(a[i]-b[i]);
            res=Math.max(c,res);
        }
        return res;
    }

}
