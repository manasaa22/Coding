import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class costOfnropes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("TOtal Cost: "+nRopes(a,n));
    }
    public static int nRopes(int a[],int n){
        Arrays.sort(a);int t=0;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        p.add(a[i]);
        while(p.size()>1){
        int x=p.poll();
        int y=p.poll();
        int c=x+y;
        t=t+c;
        p.add(c);
        }
        //c=p.peek();
        return t;
    }
}
