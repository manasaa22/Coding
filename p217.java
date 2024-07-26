/*Absolute difference between sum of even elements at even indices & odd elements at odd indices in given Array
Given an array arr[] containing N elements, the task is to find the absolute difference between the sum of even elements at even indices & the count of odd elements at odd indices. Consider 1-based indexing

Examples:

Input: arr[] = {3, 4, 1, 5}
Output: 0
Explanation: Sum of even elements at even indices: 4 {4}
Sum of odd elements at odd indices: 4 {3, 1}
Absolute Difference = 4-4 = 0

Input: arr[] = {4, 2, 1, 3}
Output: 1 */
import java.util.Scanner;
public class p217 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        absoluteDiff(arr,n);
    }
    public static void absoluteDiff(int[] a,int n) {
        int es=0,os=0;
        for(int i=1;i<=n;i++) {
            if(i%2==0){
                if(a[i-1]%2==0) es=es+a[i-1];
            }
            else
            {
                if(a[i-1]%2!=0) os=os+a[i-1];
            }
        }
        System.out.println("Difference between sum of even and odd elements is :"+Math.abs(es-os));
    }
}
