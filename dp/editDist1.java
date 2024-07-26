import java.util.Scanner;
public class editDist1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter strings");
        s1=sc.nextLine();
        s2=sc.nextLine();
        int m = s1.length(), n = s2.length();
        System.out.println("Minimum dist to convert s1 to s2   :"+dist(s1,s2,m,n));
    }
    public static int dist(String s1,String s2,int m,int n){
        if(m==0) return n;
        if(n==0) return m;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dist(s1,s2,m-1,n-1);
        }
        else{
            return Math.min(Math.min(dist(s1,s2,m-1,n),dist(s1,s2,m,n-1)),dist(s1,s2,m-1,n-1))+1;
        }
    }
}
