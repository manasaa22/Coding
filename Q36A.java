/*Find element with highest frequency in given nested Array */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q36A {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(findHighest(a,n));
    }
    public static int findHighest(int a[],int n){
        HashMap<Integer,Integer> h1=new HashMap<>();
        HashMap<Integer,Integer> h2=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int e=0;
        for(int i=0;i<n;i++){
            if(!h1.containsKey(a[i])){
                h1.put(a[i],1);
            }
            else
            h1.put(a[i],h1.get(a[i])+1);
        }
        for(int m:h1.values()){
            if(h2.containsKey(m))
            h2.put(m,h2.get(m)+1);
            else
            h2.put(m,1);
        }
        for(Map.Entry<Integer, Integer> entry : h2.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                e = entry.getKey();
            }
            if(entry.getValue()==max)
            e=Math.min(e,entry.getKey());
        }
        return e;
    }
}
