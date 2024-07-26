import java.util.Scanner;

public class minCostPath {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Number of paths are "+minCost(a,m,n));
    }
    public static int minCost(int [][] a,int m ,int n){
        int r[][]=new int[m][n];
        r[0][0]=a[0][0];int cost=0;
        for(int i=1;i<m;i++){
            r[i][0]=r[i-1][0]+a[i][0];
        }
        for(int j=1;j<n;j++){
            r[0][j]=r[0][j-1]+a[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int x=r[j-1][i];
                int y=r[i-1][j];
                int z=r[i-1][j-1];
                //System.out.println(x+"    "+y+"    "+z);
                cost=min(x,y,z);
                //System.out.println(cost);
                r[i][j]=cost+a[i][j];
                //System.out.println(r[i][j]);
            }
        }
        return r[m-1][n-1];
    }
    public static int min(int x,int y,int z){
        if(x<y){
            if(x<z) return x;
            else return z;
        }
        else
        {
            if(y<z) return y;
            else return z;
        }
    }
}
