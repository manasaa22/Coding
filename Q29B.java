/*You have given an integer matrix with odd dimensions. Find the square of the diagonal elements on both sides.*/
import java.util.ArrayList;
import java.util.Scanner;
public class Q29B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        findsqOfDiagonal(a,n);
    }
    public static void findsqOfDiagonal(int a[][],int n){
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                a1.add(a[i][j]*a[i][j]);
                if((i+j)==n-1)
                a2.add(a[i][j]*a[i][j]);
            }
        }
        System.out.println("Diagonal One"+a1.toString());
        System.out.println("Diagonal Two"+a2.toString());
    }
}
