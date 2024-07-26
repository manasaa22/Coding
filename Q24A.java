/*) A) Print all characters of string whose frequency is a power of K*/
import java.util.HashMap;
import java.util.Scanner;
public class Q24A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter k");
        int k=sc.nextInt();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        String r=getChar(s,k);
        System.out.println("SubString:"+r);
    }
    public static String getChar(String s,int k){
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else
            h.put(c,1);
        }
        for(char m:h.keySet()){
            if(isPowerofK(h.get(m), k)){
                for(int i=0;i<h.get(m);i++){
                    sb.append(m);
                }
            }
        }
        return sb.toString();
    }
    public static boolean isPowerofK(int n,int k){
        if(k==1) return (n==1);
        int pow=1;
        while(pow<n)
        pow=pow*k;

        return (pow==n);
    }
}
