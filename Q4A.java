/* A) Check whether the given number is Euclid Number or not*/
import java.util.ArrayList;
import java.util.Scanner;
public class Q4A {
    static int MAX=10000;
    static  ArrayList<Integer> al=new ArrayList<>();
    public static void main(String[] args) {
        primeArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        if (isEuclidNumber(n))
        System.out.println(n + " is an Euclidean number");
        else
        System.out.println(n + " is not an Euclidean number");
    }
    public static boolean isEuclidNumber(int n){
        int p=1;
        int i=0;
        while(p<n){
            p=p*al.get(i);
            if(p+1==n)
            return true;
            i++;
        }
        return false;
    }
    public static void primeArray(){
        boolean prime[]=new boolean[10];
        for(int i=0;i<10;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=10;p++){
            if(prime[p]==true){
                for(int i=p*2;i<10;i+=p){
                    prime[i]=false;
                }
            }
        }
        for(int p=2;p<10;p++){
            if(prime[p])
            al.add(p);
        }
    }
}
