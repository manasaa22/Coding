
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter number");
        int n=sc.nextInt();
        HashMap<Integer,Integer> h=new HashMap<>();
        while(n>0){
            int r=n%10;
            if(h.containsKey(r)){
                h.put(r,h.get(r)+1);
            }
            else
            {
                h.put(r,1);
            }
            n=n/10;
        }
        int c=0;
        for(Map.Entry<Integer,Integer> m:h.entrySet()){
            if(m.getValue()!=m.getKey()){
                if(c==0){
                System.out.println("No");
                c++;
                break;
                }
                }
                else
                {
                    continue;
                }
            }
            if(c==0){
            System.out.println("Yes");
            }

    }
}
