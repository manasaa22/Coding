
import java.util.Arrays;
import java.util.Scanner;

public class minimumCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        System.out.println("No of candies to distribute"+find(c,n));
    }
    public static int find(int c[],int n){
        int r[]=new int[n];
        Arrays.fill(r,1);
        for(int i=1;i<n;i++){
            if(c[i]>c[i-1])
            r[i]=r[i]+r[i-1];
        }
        for(int i=n-2;i>=0;i--){
            if(c[i]>c[i+1] &&r[i]<=r[i+1])
            r[i]=r[i]+r[i+1];
        }
        int s=0;
        for(int i=0;i<n;i++){
            System.out.println(r[i]+ "    "+s);
            s=s+r[i];
        }
        System.out.println(s+"    "+((n*2)-1));
        return s;
    }
}
