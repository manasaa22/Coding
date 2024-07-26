import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q27B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum:"+sumOdd(a, n, m));
    }
    public static int sumOdd(int arr[][],int n,int m){
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <m; j++)
            {
                if (mp.containsKey(arr[i][j]))
                {
                    mp.put(arr[i][j], mp.get(arr[i][j]) + 1); 
                }
                else
                {
                    mp.put(arr[i][j], 1);
                }
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> itr : mp.entrySet()) 
        {
            if (itr.getValue() % 2 != 0)
            {
                sum += (itr.getKey()) * (itr.getValue()); 
            }
        }
        return sum;
    }
}
