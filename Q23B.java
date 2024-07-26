/*B) Count all elements in the array which
appears at least K times after their first
occurrence*/
import java.util.HashMap;
import java.util.Scanner;
public class Q23B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("count:"+isCountK(a,n,k));
    }
    public static int isCountK(int []a,int n,int k){
        int c=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:a){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }
            else
            h.put(i,1);
        }
        for(int m:h.keySet()){
            if(h.get(m)>=(k+1))
            c++;
        }
        return c;
    }
}
