/*Rearrange sorted array such that all odd indices elements comes before all even indices element
Given a sorted array arr[] consisting of N positive integers, the task is to rearrange the array such that all the odd indices elements come before all the even indices elements.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
Output: 2 4 6 8 1 3 5 7 9

Input: arr[] = {0, 3, 7, 7, 10}
Output: 3 7 0 7 10 */
import java.util.ArrayList;
import java.util.Scanner;
public class p117 {
    public static void main(String []atgs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rearrangeOddEven(arr);
    }
    public static void rearrangeOddEven(int []arr){
        int n=arr.length;
        ArrayList<Integer> oi=new ArrayList<>();
        ArrayList<Integer> ei=new ArrayList<>();
        for (int i=0;i<n;i++) {
            if (i%2==0)
            ei.add(arr[i]);
            else
            oi.add(arr[i]);
        }
        System.out.println(oi+"   "+ei);
        //System.out.print(ei+" ");
    }
}
