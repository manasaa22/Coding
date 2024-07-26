
import java.util.Arrays;
import java.util.Scanner;
public class noofBoxs {
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
        //Sorting the array in ascending order
        int T=sc.nextInt();
        findmaxbox(a,n,T);
    }
    public static void findmaxbox(Integer a[][],int n,int T){
        Arrays.sort(a, (x, y) -> x[1]-y[1]);
        int s=0;
        for(int i=0;i<n;i++){
            int q=a[i][0];
            if(q<=T){
                s+=q*a[i][1];
                T=T-q;
            }
            else{
                s+=T*a[i][1];
                break;
            }
        }
        System.out.println("No of Max:"+s);
    }
}
