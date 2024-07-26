/*A)	Count words that appear exactly two times in an array of words

Given an array of n words. Some words are repeated twice, we need to count such words. 
*/
import java.util.HashMap;
import java.util.Scanner;
public class Q13A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String s[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.out.println("Count:"+countTwoTimesWords(s));
    }
    public static int countTwoTimesWords(String []s){
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<s.length;i++){
            if(h.containsKey(s[i])){
                h.put(s[i],h.get(s[i])+1);
            }
            else
            h.put(s[i],1);
        }
        int c=0;
        for(String m:h.keySet()){
            if(h.get(m)==2){
                //System.err.println("Countofwords:"+h.get(m));
                c++;
            }
        }
        return c;
    }
}
