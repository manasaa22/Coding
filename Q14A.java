/*A)	Count of camel case characters present in a given string */
import java.util.Scanner;
public class Q14A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Count of camel characters:"+countCamel(s));
    }
    public static int countCamel(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                c++;
            }
        }
        return c;
    }
}
