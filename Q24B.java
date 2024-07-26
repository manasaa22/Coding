/*B) Find all matrix elements which
are minimum in their row and maximum
in their column*/
import java.util.Scanner;
public class Q24B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        System.out.println("Enter column");
        int m=sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter the element of Matrix : ");
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Elements are :");
        findMinMaxElement(a,n,m);
    }
    public static void findMinMaxElement(int a[][],int n,int m){
        int minEle,maxEle;
        int f=0;
        for (int i=0;i<n;i++){
            minEle=a[i][0];
            maxEle=a[i][0];
            int c=0;
            for (int j=1;j<m;j++){
                if(minEle>a[i][j]){
                    minEle=a[i][j];
                    c=j;
                }
            }
            for(int j=c;j<n;j++){
                if(maxEle<a[j][c] && a[j][c]!=-1){
                    maxEle=a[j][c];
                }
            }
            if(minEle==maxEle){
                f=1;
            System.out.print(minEle+" ");
            }
        }
        if(f==0){
            System.err.println("-1");
        }
    }
}
