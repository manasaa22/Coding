/*) Find GCD of most occurring and least occurring elements of given Array */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q1B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j:arr){
            if(map.containsKey(j))
            {
                map.put(j,map.get(j)+1);
            }
            else
            map.put(j,1);
        }
        int max_count=-1 , min_count=9999999;
        int max_element=0 , min_element=0 ;
        for (Map.Entry entry: map.entrySet()) {
            int key = (int) entry.getKey() ;
            int value = (int) entry.getValue();
            if (value > max_count) {
                max_count = value ;
                max_element = key ;
            }
            if (value < min_count) {
                min_count = value ;
                min_element = key ;
                }
            }
                System.out.println("GCD of Most Occurring Elements " + gcd(max_element,min_element));
                }
                public static int gcd(int num1, int num2) {
                    while (num2 != 0) {
                        int temp = num2;
                        num2 = num1 % num2;
                        num1 = temp;
                        }
                        return num1;
                }
    }
