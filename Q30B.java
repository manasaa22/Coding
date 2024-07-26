/*Given an m x n matrix, find all common elements present in all rows in O(mn) time and one traversal of matrix.*/
import java.util.HashMap;
import java.util.Scanner;
public class Q30B {
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
        findEle(a,n,m);
    }
    public static void findEle(int a[][],int n,int m){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<m;i++){
            h.put(a[0][i],1);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if (h.get(a[i][j]) != null && h.get(a[i][j]) == i){
                    h.put(a[i][j],i+1);
                    if(i==n-1)
                System.out.print(a[i][j]+"  ");
                }
                
            }
        }
    }
}
