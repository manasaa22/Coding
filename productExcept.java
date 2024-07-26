import java.util.Scanner;

public class productExcept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int r[]=highProduct1(a,n);
        System.out.println("Product except itself: ");
        for(int i=0;i<n;i++)
        System.out.print(r[i]+" ");
    }
    public static int[] highProduct1(int a[],int n){
        int p=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            p=p*a[i];
        }
        for(int i=0;i<n;i++)
        res[i]=p/a[i];

        return res;
    }
}
