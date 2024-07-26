/*) A) Given an integer array A of size N. You need to check that whether there
exist a element which is strictly greater than all the elements on left of it
and strictly smaller than all the elements on right of it.If it exists return 1 else return 0. */
import java.util.Scanner;
import java.util.Stack;
public class Q18A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(findEle(a,n)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    public static boolean findEle(int a[],int n){
        int f=0;
        for(int i=1;i<n-1;i++){
            Stack<Integer> s1=new Stack<>();
            Stack<Integer> s2=new Stack<>();
            f=0;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    f=1;
                    s1.push(a[j]);
                }
                else{
                f=0;
                break;
                }
            }
            if(f==1){
                for(int j=n-1;j>i;j--){
                    if(a[j]>a[i]){
                        f=1;
                        s1.push(a[j]);
                    }
                    else{
                        f=0;
                        break;
                    }
                }
            }
            if(f==1){
                return true;
            }
        }
        /* if(f==1){
            return true;
        } */
        return false;
    }
}
