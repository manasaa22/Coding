/*A) Given an array of strings words and two different strings that already exist in the array word1 and word2
, return the shortest distance between
these two words in the list.*/
import java.util.Scanner;
public class Q26A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];sc.next();
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.out.println("Enter");
        String w1=sc.nextLine();
        String w2=sc.nextLine();
        System.out.println(shortestDistanceBetweenWords(s,w1,w2));
    }
    public static int shortestDistanceBetweenWords(String []s,String w1,String w2){
        int c1=-1,c2=-1;int f1=0,f2=0;
        int min=Integer.MAX_VALUE;
        System.out.println(w1+"   "+w2+s[0]);
        for(int i=0;i<s.length;i++){
            //System.out.println(s[i]);
            if(s[i].equals(w1)){
                c1=i;f1=1;
            }
            if(s[i].equals(w2)){
                c2=i;f1=1;
            }
            if(c1!=-1 && c2!=-1){
                min=Math.min(min,Math.abs(c1-c2));
            }
        }
        return min;
    }
}
