/*A)	Find elements which are present in first array and not in second */
import java.util.ArrayList;
import java.util.Scanner;
public class Q20A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sizes");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        presenrEle(a,b);
    }
    public static void presenrEle(int []a,int []b){
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> all=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            all.add(b[i]);
        }
        //System.out.println(all.toString());
        for(int i=0;i<a.length;i++){
            //System.out.println(a[i]+"   "+all);
            //System.err.println(al.contains(a[i]));
            if(!all.contains((a[i]))){
                al.add(a[i]);
            }
        }
        for(int i=0;i<al.size();i++){
            System.err.print(al.get(i)+" ");
        }
    }
}
