/* */
import java.util.HashMap;
import java.util.Scanner;
public class Q36B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("String:"+removeDuplicate(s));
    }
    public static String removeDuplicate(String s){
        HashMap<Character,Integer> h=new  HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c))
            h.put(c,h.get(c)+1);
            else
            h.put(c,1);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int m=h.get(c);
            if(m!=0){
                if(m==1)
                sb.append(c);
                else{
                    h.put(c,h.get(c)-1);
                }
            }
        }
        return sb.toString();
    }
}
