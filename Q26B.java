/*)  Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Q26B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int []nums= new int [n];
        for(int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("Number of good pairs: "+numsGoodPairs(nums));
    }
    public static int numsGoodPairs(int []a){
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i < a.length; i++){
            //System.out.println(i);
            for(int j=i+1;j<a.length;j++){
                //System.out.println(j);
                if(a[i]==a[j]){
                    //System.out.println(i+"  "+j+" "+a[i]+"  "+a[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
