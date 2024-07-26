import java.util.Arrays;
import java.util.Scanner;
public class maxLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n =sc.nextInt();
        int m=sc.nextInt();
        Integer a[][]=new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxlen(a,n));
    }
    public static int maxlen(Integer a[][],int n){
        int res=1;
        Arrays.sort(a, (x, y) -> x[1]-y[1]);
        int i=0;int j=1;
        while(i<n&&j<n){
            if(a[j][1]>a[i][0]){
                res++;
                i++;
                j=i;
            }
            else
            i++;
        }
        return res;
    }
}
