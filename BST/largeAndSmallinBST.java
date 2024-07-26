/*Find Largest and smaleest nodes values in BST without using inorder traversal */

import java.util.Scanner;

public class largeAndSmallinBST {
    public static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of node");
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            insert(root,x);
        }
        System.out.println(getLargestValue(root)+" "+getSmallestValue(root));
    }
    public static Node insert(Node root, int key) {
        Node t = new Node(key); // Corrected line
        if (root == null) {
            return t;
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
    public static int getSmallestValue(Node root){
        if(root==null) return -1;
        while(root.left!=null){
            root=root.left;
            if(root.left==null)
            return root.data;
        }
        return -1;
    }
    public static int getLargestValue(Node root){
        if(root==null) return -1;
        while(root.right!=null){
            root=root.right;
            if(root.right==null)
            return root.data;
        }
        return root.data;
    }
}
