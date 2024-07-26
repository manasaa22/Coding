import java.util.Scanner;
public class lemonade {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("True or false:"+find(a,n));
    }
    public static boolean find(int arr[],int n){
        int five=0,ten=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==5){
                five++;
            }
            else if(arr[i]==10){
                ten++;
                five--;
            }
            else if(arr[i]==20){
                if(ten>0) {
                    ten--;five--;
                }
                else{
                    five=five-3;
                }
            }
            if (five < 0) return false;
        }
        return true;
    }
}
