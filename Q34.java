/*A) Count of unique rows in a given Matrix

Given a 2D matrix arr of size N*M containing lowercase English letters, the task is to find the number of unique rows in the given matrix.
*/
import java.util.HashMap;
import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int r=sc.nextInt();
        System.out.println("Enter column");
        int c=sc.nextInt();
        String a[][] = new String[r][c];
        sc.nextLine();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextLine();
            }
        }
        System.out.println("Count:"+getCount(a,r,c));
    }
    public static int getCount(String a[][],int r,int c){
        int count=0;
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<r;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<c;j++){
                sb.append(a[i][j]);
            }
            System.out.println(sb.toString());
            String str=sb.toString();
            if(h.containsKey(str)){
                h.put(str,h.get(str)+1);
                count--;
            }
            else{
            h.put(str,1);
            count++;
            }
        }
        return count;
    }
}
