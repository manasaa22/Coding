import java.util.Scanner;

public class Q4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int ch=65;
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)ch++);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            int m=0;
            if(i==0)
            {--ch;
            m=n-i-1;}
            else
            {
            m=n-i;
            }
            for (int j = 0; j <m; j++) {
                System.out.print((char)--ch);
            }
            System.out.println();
        }
    }
}
