/*)  Given an array A with N integers, find the count of unique integers in the array. */
import java.util.HashMap;
import java.util.Scanner;
public class Q6B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Count of Unique Integers: "+uniqueIntegers(a,n));
    }
    public static int uniqueIntegers(int []a,int n){
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hp.containsKey(a[i])){
                hp.put(a[i],hp.get(a[i])+1);
            }
            else
            hp.put(a[i],1);
        }int c=0;
        for(int m:hp.keySet()){
            if(hp.get(m)==1)
            c++;
        }
        return c;
    }
}
