/*A)	Check if max occurring character of one string appears same no. of times in other */
import java.util.HashMap;
import java.util.Scanner;
public class Q11A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(maxOccur(s1,s2)) System.err.println("YES");
        else System.err.println("NO");
    }
    public static boolean maxOccur(String s1,String s2){
        HashMap<Character,Integer> h1=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c=s1.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> h2=new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char c=s2.charAt(i);
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        int max=0;
        Character ch=null;
        for (Character c : h1.keySet()) {
            if(max<h1.get(c)){
                max=h1.get(c);
                ch=c;
                }
        }
        //System.out.println(ch);
        //System.out.println(h1.get(ch)+"  "+h2.get(ch));
        return h2.containsKey(ch) && h2.get(ch).equals(max);
    }
}
