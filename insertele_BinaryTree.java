
import java.util.*;

public class insertele_BinaryTree {
    Node head;
    static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public void insertele(Node head,int val)
    {
        Node current=head;
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty())
        {
            current=queue.remove();
            if(current.left != null)
            {
                queue.add(current.left);
            }
            else
                break;
            if(current.right != null)
                queue.add(current.right);
            else
                break;
        }
        if(current.left == null)
            current.left=new Node(val);
        if(current.right == null)
            current.right=new Node(val);
    }
    public void print(Node head)
    {
        Node current=head;
        if(current != null) {
            System.out.println(current.data);
            print(current.left);
            print(current.right);
        }

    }
    public static void main(String args[])
    {
        insertele_BinaryTree tree = new insertele_BinaryTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be inserted");
        int p=sc.nextInt();
        tree.insertele(tree.head,p);
        tree.print(tree.head);
    }
}

