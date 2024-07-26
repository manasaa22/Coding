import java.util.Scanner;

/*Menu Driven Program of BST using java */
class menuDriven{
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static Node root;

    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    public static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }

    public static int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Insertion");
            System.out.println("2. Traversal");
            System.out.println("3. Deletion");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert:");
                    int data = sc.nextInt();
                    root = insert(root, data);
                    break;
                case 2:
                    if (root == null) {
                        System.out.println("BST is empty.");
                        break;
                    }
                    System.out.println("Choose traversal type:");
                    System.out.println("1. Inorder");
                    System.out.println("2. Preorder");
                    System.out.println("3. Postorder");
                    int traversalChoice = sc.nextInt();
                    switch (traversalChoice) {
                        case 1 -> {
                            System.out.print("Inorder Traversal: ");
                            inorderTraversal(root);
                            System.out.println();
                    }
                        case 2 -> {
                            System.out.print("Preorder Traversal: ");
                            preorderTraversal(root);
                            System.out.println();
                    }
                        case 3 -> {
                            System.out.print("Postorder Traversal: ");
                            postorderTraversal(root);
                            System.out.println();
                    }
                        default -> System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    if (root == null) {
                        System.out.println("BST is empty.");
                        break;
                    }
                    System.out.println("Enter data to delete:");
                    int d = sc.nextInt();
                    root = deleteNode(root, d);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Option.");
            }
        }
    }

}