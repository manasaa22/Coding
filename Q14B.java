/*B)	Max Consecutive Ones */
import java.util.Scanner;
public class Q14B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Max Consective Ones :"+maxConOnes(a));
    }
    public static int maxConOnes(int []a){
        int c=0,m=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1)c++;
            else c=0;
            m=Math.max(m,c);
        }
        return m;
    }
}
