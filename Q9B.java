/*Print all those elements that have no element greater than them 
in the right side of the array. Print elements from right to left. */
import java.util.Scanner;
import java.util.Stack;
class Q9B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        printLeaders(a,n);
    }
    public static void printLeaders(int []a,int n){
        Stack<Integer> s=new Stack<>();
        s.push(a[n-1]);
        for(int i=n-2;i>=0;i--){
            if(a[i]>=s.peek()){
                s.push(a[i]);
            }
        }
        System.out.println("ELEMENTS:");
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}