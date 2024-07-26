/*B)  GCD of more than two (or array) numbers */
import java.util.Scanner;
public class Q18B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int gcd=a[0];
        for(int i=1;i<n;i++){
            gcd=findgcd(gcd,a[i]);
        }
        System.out.println("Final GCD:"+gcd);
    }
    public static int findgcd(int a,int b){
        if(b==0)
        return a;
        else
        return(findgcd(b,a%b));
    }
}
