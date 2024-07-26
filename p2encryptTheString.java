
/*Encrypt the string – 2
Given a string S consisting of N, lower case English alphabet, it is also given that a string is encrypted by first
replacing every substring of the string consisting of the same character with the concatenation of that character
and the hexadecimal representation of the size of the substring and then revering the whole string,
the task is to find the encrypted string.

Note: All Hexadecimal letters should be converted to Lowercase letters. */
import java.util.HashMap;
import java.util.Scanner;
public class p2encryptTheString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseAndFind(s));
    }
    public static String reverseAndFind(String s){
        char c[]=s.toCharArray();
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        for(char ch:c){
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)+1);
            }
            else
            h.put(ch,1);
        }
        StringBuilder sb=new StringBuilder("");
        for(char ch:c){
            int m=h.get(ch);
            String c1=HexToAlphabet(m);
            if(sb.indexOf((Character.toString(ch)))==-1){
            sb.append(ch);
            sb.append(c1);
            }
        }
        String s1=sb.reverse().toString();
        return s1;
    }
    public static String HexToAlphabet(int c){
        String hexValue = Integer.toHexString(c);
        //System.out.println("Hexadecimal: " + c);
        //System.out.println("Corresponding Alphabet: " + hexValue);
        //char c=hex
        return hexValue;
    }
}
