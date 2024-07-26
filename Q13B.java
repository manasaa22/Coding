/*B)	Even Number of Digits */
import java.util.ArrayList;
import java.util.Scanner;
public class Q13B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<>();
        al=getEvenCount(a);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
    public static ArrayList<Integer> getEvenCount(int a[]){
        ArrayList<Integer> c= new ArrayList<>();
        for(int j:a){
            String s1=Integer.toString(j);
            if(s1.length()%2==0){
                c.add(j);
            }
        }
        return c;
    }
}
