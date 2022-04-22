package mylaptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner laptop = new Scanner(System.in);
        BinaryTree2 bt = new BinaryTree2();
        System.out.println("Binary Tree Test\n");
        char as;
        do
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            int pilihan = laptop.nextInt();
            switch (pilihan)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    bt.insert( laptop.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bt.search(
                            laptop.nextInt() ));
                    break;
                case 3 :
                    System.out.println("Nodes = "+ bt.countNodes());
                    break;
                case 4 :
                    System.out.println("Empty status = "+ bt.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n)\n");
            as = laptop.next().charAt(0);
        } while (as == 'Y'|| as == 'y');
    }
}

