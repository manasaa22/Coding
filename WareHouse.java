import java.util.Arrays;
import java.util.Scanner;
public class WareHouse{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int l=sc.nextInt();
    System.out.println(numVehicles(a,l));
  }
  public static int numVehicles(int a[],int limit){
    Arrays.sort(a);
    int n=a.length;
    int i,j;
    for(i=0,j=n-1;i<=j;j--){
      if(a[i]+a[j]<=limit) i++;
    }
    return a.length-1-j;
  }
}