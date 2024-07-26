import java.util.LinkedList;
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1.Insertion \n 2.Deletion \n 3.Search \n 4.Display \n 5.Exit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("1.InsertAtFirst \n 2.InsertionAtEnd \n 3.InsertionAtMiddle");
                    int c = sc.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("Enter element to insert at first:");
                            l.addFirst(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter element to insert at end:");
                            l.addLast(sc.nextInt());
                            break;
                        case 3:
                            System.out.println("Enter element and position to insert at middle:");
                            int ele = sc.nextInt(), pos = sc.nextInt();
                            l.add(pos, ele);
                            break;
                    }
                    break;
                    
                case 2:
                    System.out.println("1.DeletionAtFirst \n 2.DeletionAtEnd \n 3.DeletionAtMiddle");
                    int deleteChoice = sc.nextInt();
                    switch (deleteChoice) {
                        case 1:
                            if (!l.isEmpty()) {
                                System.out.println("Deleted element from first: " + l.removeFirst());
                            } else {
                                System.out.println("List is empty.");
                            }
                            break;
                        case 2:
                            if (!l.isEmpty()) {
                                System.out.println("Deleted element from end: " + l.removeLast());
                            } else {
                                System.out.println("List is empty.");
                            }
                            break;
                        case 3:
                            System.out.println("Enter position to delete from middle:");
                            int pos = sc.nextInt();
                            if (pos >= 0 && pos < l.size()) {
                                System.out.println("Deleted element from position " + pos + ": " + l.remove(pos));
                            } else {
                                System.out.println("Invalid position.");
                            }
                            break;
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter element to search:");
                    int searchElement = sc.nextInt();
                    int index = l.indexOf(searchElement);
                    if (index != -1) {
                        System.out.println("Element " + searchElement + " found at index " + index);
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;
                    
                case 4:
                    System.out.println("List elements: " + l);
                    break;
                    
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);
        
        sc.close();
    }
}
