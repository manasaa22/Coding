import java.util.Scanner;

public class countPaths1 {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();int i=0,j=0;
        System.out.println("Number of paths are "+paths(m,n,i,j));
    }
    public static int  paths(int m, int n,int i,int j){
        if(i==m-1 && j==n-1)
        return 1;
        else if (i >= m || j >= n)
            return 0;
        else{
            return paths(m,n,i+1,j)+paths(m,n,i,j+1);
        }
    }
}
