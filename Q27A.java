/*Given an array arr containing N strings,
the task is to check if all strings are
isogram or not. If they are, print Yes,
otherwise No.
An Isogram is a word in which no
letter occurs more than once.
*/
import java.util.HashMap;
import java.util.Scanner;
public class Q27A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        String s[]=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.nextLine();
        }
        System.out.println(checkIsogram(s));
    }
    public static boolean checkIsogram(String []s){
        for(int i=0;i<s.length;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            char c[]=s[i].toCharArray();
            for(int j=0;j<c.length;j++){
                Integer x=map.get(c[j]);
                if(x!=null && x+1>0)return false;
                map.put(c[j],x==null?1:x+1);
            }
        }
        return true;
    }
}
