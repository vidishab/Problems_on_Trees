
import java.util.Scanner;
import java.util.Stack;

public class searchele_BinaryTree {
    Node head;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public void print(Node head)
    {
        Stack<Node> s = new Stack<>();
        Node current=head;
        while(current != null || s.size() > 0)
        {
            while (current != null)
            {
                System.out.println(current.data);
                s.push(current);
                current=current.left;
            }
            current=s.pop();
            current=current.right;
        }
    }
    public void search(Node head,int val) {
        Stack<Node> s = new Stack<>();
        Node current = head;
        while (current != null || s.size() > 0)
        {
            while (current != null)
            {
                //current=s.peek();
                if (current.data == val) {
                    System.out.println("Found");
                    s.push(current);
                    break;
                }
                s.push(current);
                current=current.left;
            }
            current=s.pop();
            current=current.right;
        }
        System.out.println("Element not found");
    }
    public void search_recur(Node head,int val)
    {
        Node current=head;
        if(current!=null)
        {
            if(current.data == val)
                System.out.println("Found");
            search(head.left,val);
            search(head.right,val);
        }
    }
    public static void main(String args[])
    {
        searchele_BinaryTree tree = new searchele_BinaryTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.print(tree.head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be searched");
        int u=sc.nextInt();
        tree.search(tree.head,u);
        //tree.search_recur(tree.head,u);
    }
}

