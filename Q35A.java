/*A) Sum of all elements repeating ‘k’ times in an array
Given an array, we have to find the sum of all the elements repeating k times in an array. We need to consider every repeating element just once in the sum.
*/
import java.util.HashMap;
import java.util.Scanner;
public class Q35A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n =sc.nextInt();
        int arr[]= new int[n];
        //System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println("SUM:"+sumofallEle(arr,k));
    }
    public static int sumofallEle(int a[],int k){
        int sum=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else
            h.put(a[i],1);
        }
        for(int i : h.keySet()){
            if(h.get(i)==k)
            sum=sum+i;
        }
        return sum;
    }
}
