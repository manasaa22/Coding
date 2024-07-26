/* A.	Sum of all Perfect numbers lying in the range [L, R]*/
import java.util.Scanner;
public class Q5A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the L and R");
        int L = sc.nextInt();
        int R=sc.nextInt();
        int s=0;
        for(int i=L;i<=R;i++){
            if(isPerfectNum(i)){
                s=s+i;
            }
        }
        System.out.println("The sum is : "+s);
    }
    public static boolean isPerfectNum(int n){
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i)
                sum=(sum + i + n/i );
                else
                sum+=i;
            }
        }
        if(sum==n)return true;
        else return false;
    }
}
