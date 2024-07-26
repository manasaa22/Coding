import java.util.Arrays;
import java.util.Scanner;

public class assignCookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Children:");
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no of cookies:");
        int m =sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Maximum Cookies given: "+find(arr,a,n,m));
    }
    public static int  find(int s[],int g[],int n,int m){
        int i=0,j=0,c=0;
        Arrays.sort(s);Arrays.sort(g);
        while(j < n && i < m) {
            if(s[j]>=g[i])
            {
                c++;i++;j++;
            }
            else
            j++;
        }
        return c;
    }
}
