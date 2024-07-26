/*A)  Count Distinct Strings present in an array  */
import java.util.HashMap;
import java.util.Scanner;
public class Q22A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        sc.next();
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.out.println("Count:"+isDistinctCount(s));
    }
    public static int isDistinctCount(String []s){
        HashMap<String,Integer> h=new HashMap<>();
        int c=0;
        for(String s1:s){
            if(h.containsKey(s1)){
                h.put(s1,h.get(s1)+1);
            }
            else
            h.put(s1,1);
        }
        for(String m:h.keySet()){
            if(h.get(m)==1)
            c++;
        }
        return c;
    }
}
