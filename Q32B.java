/*B) Count number of free cell present in the Matrix*/
import java.util.Scanner;

public class Q32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter k");
        int k = sc.nextInt();
        int a[][] = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        freeCell(a, n, k);
    }

    public static void freeCell(int[][] a, int n, int k) {
        int[] ans = new int[k];
        int[] rv= new int[n];
        int[] cv= new int[n];
        int row_count = 0;
        int column_count = 0;

        for (int i = 0; i < k; i++) {
            int r = a[i][0];
            int c = a[i][1];
            if (rv[r] == 0) {
                row_count++;
                rv[r] = 1;
            }
            if(cv[c] == 0) {
                column_count++;
                cv[c] = 1;
            }
            System.out.println(r+"  "+c+" "+row_count+" "+column_count);
            ans[i] = ((n*n) -( row_count*n)  - (column_count*n)+(row_count*column_count));
        }

        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
