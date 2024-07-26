/*Today's tasks
Encrypt the given string with the following operations
Given a string s, the task is to encrypt the string in the following way:
If the frequency of current character is even, then increment current character by x.
If the frequency of current character is odd, then decrement current character by x.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class p119 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter number");
        int n=sc.nextInt();
        encryptString(s,n);
    }
    public static void encryptString(String s,int n){
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int freq = map.get(c);
            char res;int k=0;
            if (freq % 2 == 0) {
                k=c + n;
                if(k>122)
                {
                    int d=k-122;
                    k=96+d;
                }
                res = (char)(k);
                
                //System.out.println(res);
            }
            else{
                //System.out.println((int)c);
                //System.out.println(c);
                k=(int)c-n;
                //System.out.println(k);
                if(97>k){
                    int d=97-k;
                    k=123-d;
                }
                //System.out.println(k);
                res = (char)(k);
            }
            sb.append(res);
            
        }
        System.out.print(sb.toString());
        System.out.println();
        for(char ch='a';ch<='z';ch++){
            System.out.print((int)ch+"  ");
        }
    }
}
