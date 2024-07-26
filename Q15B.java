/*B) Rearrange array such that even positioned are greater than odd 
 * Given an array A of n elements, sort the array according to the following relations :  
•	A[i]>=A[i-1], if i is even.  
•	A[i]<=A[i-1], if i is odd. 

*/
import java.util.Scanner;
public class Q15B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        rearrangeArray(a);
    }
    public static void rearrangeArray(int a[]){
            for (int i = 1; i < a.length; i++) {
                if (i % 2 != 0) {
                    if (a[i] < a[i - 1]) {
                        int j = i;
                        if (j > 0 && a[j] < a[j - 1]) {
                            int temp = a[j];
                            a[j] = a[j - 1];
                            a[j - 1] = temp;
                            j--;
                        }
                    }
                } else {
                    if (a[i] > a[i - 1]) {
                        int k = i;
                        if(k > 0 && a[k] > a[k - 1]) {
                            int temp = a[k];
                            a[k] = a[k - 1];
                            a[k - 1] = temp;
                            k--;
                        }
                    }
                }
            }
        System.out.println("Rearranged array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            }
        /* for (int i = 1; i <a.length; i++) {
            if (i % 2 == 0) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
            else {
                if (a[i] > a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        } */
    }
}
