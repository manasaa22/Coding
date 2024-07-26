/*).  A) Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details. */
import java.util.ArrayList;
import java.util.Scanner;
public class Q17A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        antiDiagonal(a,n);
    }
    public static void antiDiagonal(int [][]a,int n){
    int r= 2 * n - 1;
    ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    for(int i = 0; i < r; i++)
        al.add(new ArrayList<>());
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            al.get(i + j).add(a[i][j]);
    for(int i = 0; i < al.size(); i++)
    {
        System.out.println();
        for(int j = 0; j < al.get(i).size(); j++)
            System.out.print(al.get(i).get(j) + " ");
    }
    }
}
