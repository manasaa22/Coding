//2 3 4 5 6 7 7
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class goldCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the size of array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Value "+find(arr));
    }
    public static int find(int []a){
        int n=a.length;
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            p.add(a[i]);
        }
        int sum=0,count=0;
        while (p.size() > 1)
        { int y = p.poll();
        int x = p.poll();;
        if (x < y)
            p.add(y - x);
        }
        if(p.size()==0)
        return 0;
        return p.poll();
    }
}
