import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DFSWithoutRecursionAm {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int a[][];
    public static void main(String[] args) {
        System.out.println("Enter edges");
        n=sc.nextInt();
        a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter does there is edge between "+i+"    "+j);
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter start vertex");
        int v=sc.nextInt();
        int visited[]=new int[n];
        Arrays.fill(visited,0);
        dfs(v,visited);
    }
    private static void dfs(int v,int [] visited){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.push(v);
        while(!ll.isEmpty()){
            int s=ll.poll();
            if(visited[s]==1) continue;
            else{
                visited[s]=1;
                System.out.print(s+"   ");
            }
            for(int i=0;i<visited.length;i++){
                if(visited[i]==0 && a[s][i]==1){
                    ll.push(i);
                }
            }
        }
    }
}
