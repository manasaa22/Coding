import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class DFSWithoutRecusionAL {
    static class Graph{
        int n;
        LinkedHashMap<Integer, ArrayList<Integer>> adjList = new LinkedHashMap<>();
        Graph(int vertices) {
            n = vertices; 
            for (int i = 0; i < vertices; i++) {
                adjList.put(i, new ArrayList<>());
            }
        }
        void addEdge(int v, int w) {
            if (!adjList.containsKey(v)) {
                adjList.put(v, new ArrayList<>());
            }
            adjList.get(v).add(w);
        }
        void DFS(int s) {
            boolean[] visited = new boolean[n];
            LinkedList<Integer> ll=new LinkedList<>();
            ll.push(s);
            while (!ll.isEmpty()) {
                s = ll.pop();
                if (!visited[s]) {
                    System.out.print(s + " ");
                    visited[s] = true;
                }
                for (int e: adjList.get(s)) {
                    if (!visited[e])
                        ll.push(e);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertices");
        int n=sc.nextInt();
        Graph graph = new Graph(n);
        int ch=1;
        System.out.println("Enter edges");
        while (true) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            if (v < 0 || v > n || w < 0 || w > n) {
                System.out.println("Invalid vertex. Vertex numbers should be between 1 and " + n + ".");
                continue;
            }
            graph.addEdge(v, w);
            System.out.println("Do you want to continue");
            ch=sc.nextInt();
            if(ch!=1)break;
        }
        System.out.println("Enter starting vertex");
        int s=sc.nextInt();
        graph.DFS(s);
    }
}
