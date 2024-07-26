/*A)	Maximum Consecutive Zeroes in Concatenated Binary String */
import java.util.Scanner;
public class Q16A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary string:");
        String s=sc.nextLine();
        int n = s.length(), count=0, m=0;
        int k=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
            count++;
            else
            count = 0;
            m=Math.max(count,m);
        }
        int e=0,j=0;
        while((j<n)&&(s.charAt(j)=='0')){
            e++; j++ ;
        }
        int z=n-1;
        while ((z>=0) && (s.charAt(z) == '0')){
            e++;
            z--;
        }
        if(k==1) System.err.println("COunt:"+m);
        else{
            System.out.println("Count:");
            if(e>m)
            System.out.print(e);
            else
            System.out.print(m);
        }
    }
}
