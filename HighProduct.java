import java.util.Scanner;

public class HighProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int r[]=highProduct(a,n);
        System.out.println("Product except itself: ");
        for(int i=0;i<n;i++)
        System.out.print(r[i]+" ");
    }
    public static int[] highProduct(int a[],int n){
        int l[]=new int[n];l[0]=1;
        int r[]=new int[n];r[n-1]=1;
        int res[]=new int[n];
        for(int i=1;i<n;i++){
            l[i]=l[i-1]*a[i-1];
            //System.out.print(l[i]+ "     ");
        }
        //System.out.println("");
        for(int i=n-2;i>=0;i--){
            r[i]=r[i+1]*a[i+1];
            //System.out.println(r[i]+ "     "+a[i+1]+"    "+r[i+1]);
        }
        for(int i=0;i<n;i++)
        res[i]=l[i]*r[i];

        return res;
    }
}
