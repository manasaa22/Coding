import java.util.Scanner;

public class Q15B1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        rearrange(a, n);
    }
    public static void rearrange(int[] arr, int n)
    {
        for (int i =1; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            else {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
