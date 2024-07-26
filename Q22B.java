/*B)	Count of elements in Array which are present K times & their double isn’t present */
import java.util.HashMap;
import java.util.Scanner;
public class Q22B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter k value");
        int k=sc.nextInt();
        System.out.println("Count"+countOfk(a,n,k));
    }
    public static int countOfk(int a[],int n,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else
            h.put(a[i],1);
        }
        int c=0;
        for(int m:h.keySet()){
            if(h.get(m)==k && (!h.containsKey(2*m)))
            c++;
        }
        return c;
    }
}
