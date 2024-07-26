/*31) A) Count of sticks required to represent the given string*/
import java.util.Scanner;
public class Q31A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        int n =str.length();
        System.out.println("No of match sticks require:"+countMatchSticks(str));
    }
    public static int countMatchSticks(String s){
        if (s == null || s.length() == 0) return 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            count=count+noofMSR(c);
        }
        return count;
    }
    public static int noofMSR(char c){
        char alpha[]={6,7,4,6,5,4,6,5,2,4,4,3,6,6,6,5,7,6,5,3,5,4,6,4,3,4};
        char digit[]={6,2,5,5,4,5,6,3,7,6};
        if(!Character.isDigit(c)){
            int r=(int)c;
            return alpha[r-65];
        }
        else{
            int d=(int)c;
            //System.out.println(d);
            return digit[d-48];
        }
    }
}
