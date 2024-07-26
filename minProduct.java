import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class minProduct{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        Integer b[] = new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("The mi product"+find(a,b,n));
    }
    public static int find(int a[], Integer b[], int n) {
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + a[i] * b[i];
        }
        return s;
    }
}