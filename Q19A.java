/*Given a matrix of M * N elements (M rows, N columns), return all elements of the matrix in spiral order */
import java.util.Scanner;
public class Q19A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int a1[]=new int[n*m];
        a1=spiralOrder(a,n,m);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
    }
    public static int[] spiralOrder(int a[][],int n,int m){
        int arr[]=new int[n*m];int c=0;
        //System.out.println(n+" "+m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //System.out.println(i+" "+j);
                arr[c]=a[i][j];
                c++;
            }
        }
        return arr;
    }
}
