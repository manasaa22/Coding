/*A) Modify a matrix by replacing each element with the maximum of its left or right diagonal sum
Given a matrix mat[][] with dimensions M * N, the task is to replace each matrix elements with the maximum sum of its left or right diagonal.
*/
import java.util.HashMap;
import java.util.Scanner;
public class Q33A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=sc.nextInt();
        System.out.println("Enter columns");
        int m=sc.nextInt();
        int a[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        ModifyMatrix(a,n,m);
    }
    public static void ModifyMatrix(int a[][],int row,int col){
        HashMap<Integer,Integer> r=new HashMap<>();
        HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!r.containsKey(i+j)){
                    r.put(i+j,a[i][j]);
                }
                else
                {
                    r.put(i+j,r.get(i+j)+a[i][j]);
                }
                if(!l.containsKey(i-j)){
                    l.put(i-j,a[i][j]);
                }
                else
                {
                    l.put(i-j,l.get(i-j)+a[i][j]);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=Math.max(r.get(i+j),l.get(i-j));
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
