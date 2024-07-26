import java.util.Scanner;
public class mirrorTree{
    static Scanner sc=new Scanner(System.in);
    static class Node{
        int data;
        Node left,right;
        Node(){
            right=left=null;
        }
        public Node(int item) {
            data=item;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Enter data");
        Node root=new Node(sc.nextInt());
        System.out.println("Enter no of nodes");
        int n=sc.nextInt();
        buildTree(root,n);
        display(root);
       // mirrorTree(root);
       // display(root);
    }
    private static void buildTree(Node root,int n){
        while(n>0){
            System.out.println("Enter your data");
            int num=sc.nextInt();
            insert(root,num);
            n--;
        }
    }
    private static void mirrorTree(Node root){
        
    }
    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }
    public static void display(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            display(root.left);
            display(root.right);
        }
    }
}