/*Count of strings with frequency of each character at most X and length at least Y*/
import java.util.HashMap;
import java.util.Scanner;
public class Q34B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String []s=new String[n];
        sc.nextLine();
        for (int i=0;i<n;i++) s[i]=sc.nextLine();
        System.out.println("At most");
        int x=sc.nextInt();
        System.out.println("At Least");
        int y=sc.nextInt();
        System.out.println("Count:"+getCountofString(s,x,y));
    }
    public static int getCountofString(String []s,int x,int y){
        int count=0;
        for(int i=0;i<s.length;i++) {
            //System.out.println(s[i]+isValid(s[i],x,y));
            if(isValid(s[i],x,y))count++;
        }
        return count;
    }
    public static boolean isValid(String s,int x,int y){
        HashMap <Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else
            map.put(c,map.get(c)+1);
        }
        //System.out.println(s);
        for(char m:map.keySet()){
            //System.out.println(map.get(m));
            if(map.get(m)<x ||map.get(m)>y)return false;
        }
        return true;
    }
}
