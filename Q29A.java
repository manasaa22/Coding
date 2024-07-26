/* A) Program to check if all characters have even frequency

Given a string S consisting only of lowercase letters check if the string has all characters appearing even times. 
*/
import java.util.HashMap;
import java.util.Scanner;
public class Q29A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(checkEvenFrequency(s)){
            System.out.println("YES");
        }
        else
        System.out.println("No");
    }
    public static boolean checkEvenFrequency(String s){
        if(s.length()%2!=0)
        return false;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c))
            h.put(c,h.get(c)+1);
            else
            h.put(c,1);
        }
        for(char c:h.keySet()){
            if(h.get(c)%2!=0)
            return false;
        }
        return true;
    }
}
