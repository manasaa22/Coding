
import java.util.Arrays;
import java.util.Scanner;

public class minNumofPlatforms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arrival[]=new int[n];
        int departure[] = new int[n];
        System.out.println("Enter arrivial");
        for (int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
        }
        System.out.println("Enter departures");
        for (int i=0;i<n;i++){
            departure[i]=sc.nextInt();
        }
        //System.out.println("Function calling");
        System.out.println(minNumberOfPlatforms(arrival,departure,n));
    }
    public static int minNumberOfPlatforms(int []arrival,int[] departure,int n){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        //System.out.println("Sorted"+n);
        int platforms=1;
        int res=1;
        int i=1,j=0;
        while(i<n && j<n){
            //System.out.println(arrival[i]+ "     "+departure[i]+"     "+(arrival[i]<=departure[j])+"    "+(arrival[i]>departure[i]));
            if(arrival[i]<=departure[j]){
                //System.out.println("In if");
                platforms++;
                i++;
            }
            else if(arrival[i]>departure[j])
            {
                //System.out.println("In elsde");
                platforms--;
                j++;
            }
            res=Math.max(res,platforms);
            //System.out.println("in loop"+i+"    "+j+"    "+res+"   "+platforms);
        }
        return res;
    }
}
