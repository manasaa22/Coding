/*B) Print matrix in snake pattern

Given an n x n matrix. In the given matrix, you have to print the elements of the matrix in the snake pattern.
*/
import java.util.Scanner;
public class Q28B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int c;
            if(i%2==0){
                    c=0;
                }
                else
                c=n-1;
            for(int j=0;j<n;j++){
                System.out.print(a[i][c]+"   ");
                if(i%2==0) c++;
                else c--;
            }
        }
    }
}
