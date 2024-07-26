/* B)	Print all array elements occurring at least M times */
import java.util.HashMap;
import java.util.Scanner;
public class Q3B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n =sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the minimum number ");
        int m=sc.nextInt();
        printEle(a,m,n);
    }
    public static void printEle(int a[],int m,int n){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else
            h.put(a[i],1);
        }
        for(int v:h.keySet()){
            if(h.get(v)>=m){
                System.out.print(v+" ");
            }
        }
    }
}
