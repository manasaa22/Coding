/*B)	Expand the string according to the given conditions  */
import java.util.Scanner;
import java.util.Stack;
public class Q17B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        expandString(s);
    }
    public static void expandString(String s){
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    //stk.pop();
                    //System.out.println(stk.pop());
                    s1.append(stk.pop());
                    //System.out.println(s1.toString());
                }
               // System.out.println(s1.toString());
                if (!stk.isEmpty() && stk.peek()=='(') {
                    stk.pop();
                    int count=0;
                if(!stk.isEmpty() && Character.isDigit(stk.peek())) {
                    count=(int)stk.pop();
                    //System.out.println(count);
                    //System.out.println(s1.toString());
                    s1.reverse();
                    for(int j=0;j<count-48;j++){
                        //System.out.println(s1.reverse());
                        sb.append(s1);
                    }
                    s1.delete(0, s1.length());
                }
                //converting count into a character array and appending to s1
            }
        }
        else
        stk.push(c);
    }
    System.out.println(sb.toString());
}
}
