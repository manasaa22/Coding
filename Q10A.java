/*A)	Missing characters to make a string Pangram*/
import java.util.Arrays;
import java.util.Scanner;
public class Q10A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s =sc.nextLine();
        missingPanagram(s);
    }
    public static void missingPanagram(String s){
        char ch[]=s.toCharArray();
        boolean b[]= new boolean[26];
        Arrays.fill(b,false);
        for (int i = 0; i < ch.length; i++) {
            if(Character.isLetter(ch[i])){
                int index=(char)(ch[i]-'a');
                //System.out.println(index);
                b[index]=true;
            }
            }
            for (int i=0;i<ch.length;i++) {
                if (!b[i]) {
                    System.out.print((char)('a'+i));
                    }
        }
        }
    }

