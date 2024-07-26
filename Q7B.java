/*B)	Given an array of size N, which contains the voting ID's of students that
have stood up for the elections for class monitor, the candidate with votes greater than half
the strength of the class will become monitor, find the ID of candidate that can become monitor
 else return -1 if no one can become. */
import java.util.HashMap;
import java.util.Scanner;
public class Q7B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter n value");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("ID of candidatte that can become monitor: "+greaterThanK(a,n));
    }
    public static int greaterThanK(int []a,int n){
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hp.containsKey(a[i])){
                hp.put(a[i],hp.get(a[i])+1);
            }
            else
            hp.put(a[i],1);
        }
        for(int m:hp.keySet()){
            if(hp.get(m)>(n/2))
            return m;
        }
        return -1;
    }
}
