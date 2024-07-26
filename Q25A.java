/*A) Replace the odd positioned
elements with their cubes and
even positioned elements with
their squares*/
import java.util.Scanner;
class Q25A{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        updateArray(a,n);
    }
    public static void updateArray(int a[],int n){
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if((i+1)%2==0){
                arr[i]=a[i]*a[i];
            }
            else
            {
                arr[i]=a[i]*a[i]*a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}