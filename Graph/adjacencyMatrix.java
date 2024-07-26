/*Storing graph using adjacency  matrix representation
 */

import java.util.Scanner;

class adjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n=sc.nextInt();
        System.out.println("Enter edges");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nAdjacency Matrix Representation is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    System.out.print(i+"-->"+j+"    ");
                }
            }
            System.out.println();
        }
    }
}