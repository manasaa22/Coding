/*B.	Count smaller elements on Right side */
import java.util.Scanner;
public class Q16B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        countSmallerEle(a,n);
    }
    public static void countSmallerEle(int []a,int n){
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            c[i]=count;
        }
        System.out.println("Elements Counted are:");
        for(int i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }
    }
}
