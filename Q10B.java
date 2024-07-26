/*B)	Given an array A of N elements, your task is to print all those indexes that
 have values greater than its left and right neighbors. In case of extreme indexes like
  0 and N-1, check with their single neighbor. */
import java.util.Scanner;
public class Q10B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Indexes are :");
        findGreaterNeighbours(a, n);
    }
    public static void findGreaterNeighbours(int a[],int n){
        for(int i=0;i<n;i++){
            if((i==0 && a[i]>a[i+1]) || (i==n-1 && a[i]>a[i-1])||(i!=0&&i!=n-1&&a[i]>a[i-1]&&a[i]>a[i+1])){
                System.out.print(i+" ");
            }
        }
    }
}
