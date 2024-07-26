import java.util.Arrays;
import java.util.Scanner;

public class countPaths {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Number of paths are "+countPaths(m,n));
    }
    public static int  countPaths(int m, int n){
        int r[][]=new int[m][n];
        for(int []row:r){
            Arrays.fill(row,1);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                r[i][j]=r[i-1][j]+r[i][j-1]+r[i-1][j-1];
            }
        }
        return r[m-1][n-1];
    }
}
