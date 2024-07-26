import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class DFSWithRecusionAL {
    static class Graph{
        int n;
        LinkedHashMap<Integer, ArrayList<Integer>> adjList = new LinkedHashMap<>();
        Graph(int vertices) {
            n = vertices; // assign vertices to n
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
            recursiveDFS(s, visited);
        }
        
        void recursiveDFS(int current, boolean[] visited) {
            visited[current] = true;
            System.out.print(current + " ");
            for (int neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    recursiveDFS(neighbor, visited);
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

