import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class adjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        
        LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        int ch=1;
        System.out.println("Enter edges");
        while (true) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            if (v < 0 || v > n || w < 0 || w > n) {
                System.out.println("Invalid vertex. Vertex numbers should be between 1 and " + n + ".");
                continue;
            }
            map.get(v).add(w);
            System.out.println("Do you want to continue");
            ch=sc.nextInt();
            if(ch!=1)break;
        }
        System.out.println("Adjacency List:");
        for (int key : map.keySet()) {
            System.out.print(key + " --> ");
            for (int val : map.get(key)) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
