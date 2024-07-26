/*) A) Modify a string by circularly shifting each character to the right by respective frequencies */
import java.util.HashMap;
import java.util.Scanner;
public class Q28A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        System.out.println(circularShiftString(s,n));
    }
    public static String circularShiftString(String s,int n){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else
            h.put(c,1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int f=h.get(c);
            //System.out.println(f);
            int r=(int)c+f;
            //System.out.println((int)c+f+"   "+(int)'a');
            //System.out.println((char)r);
            int a=((int)c-48)+f;
            char m=(char)(a%26);
            sb.append((char)r);
        }
        return sb.toString();
    }
}
