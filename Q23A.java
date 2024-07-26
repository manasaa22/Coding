/*Count of strings with frequency of each character at most K */
import java.util.HashMap;
import java.util.Scanner;
public class Q23A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//sc.next();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.err.println("Enter k value");
        int k=sc.nextInt();
        int c=countChar(s,n,k);
        System.out.println("count:"+(c-1));
    }
    public static int countChar(String []s,int n,int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(isCountofK(s[i],k)){
                //System.out.println(s[i]);
                //System.err.println(c);
                c++;
            }
        }
        return c;
    }
    public static boolean isCountofK(String str,int k){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(h.containsKey(str.charAt(i))){
                h.put(str.charAt(i),h.get(str.charAt(i))+1);
            }
            else
            h.put(str.charAt(i),1);
        }
        for(char m:h.keySet()){
            if(h.get(m)==k)
            {
                continue;
            }
            else
            return false;
        }
        return true;
    }
}
