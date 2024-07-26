/*B)	Cumulative Sum
 * The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
 */
import java.util.Scanner;
public class Q11B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            a[i]=a[i]+a[i-1];
        }
        System.err.println("Elements are:");
        for(int i=0;i<n;i++){
            System.err.print(a[i]+" ");
        }
    }
}
