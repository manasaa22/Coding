import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ecrypted string");
        StringBuilder  str=new StringBuilder();
        String s=sc.nextLine();
        int c=1;
        for(int i=0;i<s.length();i=i+c){
            str.append(s.charAt(i));
           // System.out.print(s.charAt(i));
            c++;
        }
        System.out.println(str.toString());
    }
}
