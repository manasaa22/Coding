/*B)	Find Kth most occurring element in an Array */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
class Q2B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println(kthMostOccuringElement(a,n,k));
    }
    public static int kthMostOccuringElement(int []a,int n,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else
            h.put(a[i],1);
        }
        //int s[]=new int[n];
        Object[] s = h.keySet().toArray();
        Arrays.sort(s);
        int m1=h.size();
        System.err.println(m1);
        //System.out.println(s.toString());
        int v=(int)s[m1-k-1];
        System.out.println(v);
        for(int m:h.keySet()){
            if(h.get(m)==v)
            {
                System.out.println(m);
                return (int)m;
            }
        }
        return a[0];
    }
}