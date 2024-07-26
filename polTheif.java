
import java.util.ArrayList;
import java.util.Scanner;

public class polTheif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1.length());
        char a[]=new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
            a[i] = s1.charAt(i);
        }
        System.out.println("Enter limit");
        int k=sc.nextInt();
        System.out.println("No of theifs caught"+find(a,s1.length(),k));
    }
    public static int find(char[] a, int n, int k) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();
    
        for (int i = 0; i < n; i++) {
            if (a[i] == 'P') {
                p.add(i);
            } else {
                t.add(i);
            }
        }
    
        int i = 0, j = 0, res = 0;
        System.out.println(p.size()+"    "+t.size());
        while (i < p.size() && j < t.size()) {
            System.out.println(p.get(i)+ "    "+t.get(i));
            if (Math.abs(p.get(i) - t.get(j)) <= k) {
                res++;
                i++;
                j++;
            } else if (p.get(i) < t.get(j)) {
                i++;
            } else {
                j++;
            }
        }
    
        return res;
    }
    
}
