/*Check if a given string is a rotation of a palindrome */
import java.util.HashMap;
import java.util.Scanner;
public class Q21B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isRotationPlain(s)){
            System.out.println("1");
        }
        else
        System.out.println("0");
    }
    public static boolean isRotationPlain(String s){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else
            h.put(c,1);
        }
        int c=0;
        for(char m:h.keySet()){
           // System.out.println(h.get(m));
            if(h.get(m)%2==1){
                c++;
            }
        }
        if(c<=1){
            return true;
        }
        else
        return false;
    }
}
